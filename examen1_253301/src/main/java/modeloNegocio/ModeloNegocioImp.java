/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import dto.HorarioCitaDTO;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación del modelo de negocio.
 * Simula la gestión de pacientes, médicos y citas médicas
 * usando listas en memoria en lugar de una base de datos real.
 * 
 * @author 0000253301 Isabel Valenzuela Rocha
 */
public class ModeloNegocioImp implements IModeloNegocio {

    private static final Logger LOG = Logger.getLogger(ModeloNegocioImp.class.getName());

    // Listas mock a modo de simulación de base de datos
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<CitaMedica> citas;

    /**
     * Constructor que inicializa las listas simuladas.
     */
    public ModeloNegocioImp() {
        this.citas = new LinkedList<>();
        mockPacientes();
        mockMedicos();
    }

    /**
     * Busca y devuelve un paciente a partir de su número de seguridad social.
     *
     * @param nss Número de Seguridad Social del paciente.
     * @return Paciente encontrado, o null si no existe.
     */
    @Override
    public Paciente obtenerPaciente(String nss) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNss().equals(nss)) {
                LOG.log(Level.INFO, "Paciente obtenido: {0}", paciente.toString());
                return paciente;
            }
        }

        return null;
    }

    /**
     * Obtiene la lista de todos los médicos registrados en el sistema.
     *
     * @return Lista de objetos Medico.
     */
    @Override
    public List<Medico> obtenerMedicos() {
        return medicos;
    }

    /**
     * Busca y devuelve un médico a partir de su cédula profesional.
     *
     * @param cedula Cédula profesional del médico.
     * @return Medico encontrado, o null si no existe.
     */
    @Override
    public Medico obtenerMedico(String cedula) {
        for (Medico medico : medicos) {
            if (medico.getCedula().equals(cedula)) {
                LOG.log(Level.INFO, "Médico obtenido: {0}", medico.toString());
                return medico;
            }
        }

        return null;
    }

    /**
     * Registra una cita médica en el sistema.
     *
     * @param cita Objeto CitaMedica que contiene la información de la cita a
     * registrar.
     * @return La cita médica registrada con los datos confirmados.
     */
    @Override
    public CitaMedica registrarCita(CitaMedica cita) {
        citas.add(cita);
        LOG.log(Level.INFO, "Cita registrada: {0}", cita.toString());
        return cita;
    }

    /**
     * Obtiene la lista de citas disponibles en la agenda de un médico
     * identificado por su cédula.
     *
     * @param cedula Cédula profesional del médico.
     * @return Lista de objetos HorarioCitaDTO con las citas disponibles.
     */
    @Override
    public List<HorarioCitaDTO> obtenerCitasDisponibles(String cedula) {
        List<HorarioCitaDTO> disponibles = new ArrayList<>();

        // Buscar el médico
        Medico medico = medicos.stream()
                .filter(m -> m.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);

        if (medico == null) {
            return disponibles; // no encontrado
        }

        // Mockear disponibilidad solo para la próxima semana
        LocalDate hoy = LocalDate.now();
        LocalDate limite = hoy.plusWeeks(1);

        for (LocalDate fecha = hoy; !fecha.isAfter(limite); fecha = fecha.plusDays(1)) {
            DayOfWeek diaSemana = fecha.getDayOfWeek();

            // Buscar horarios del médico para ese día
            for (HorarioConsulta h : medico.getHorarios()) {
                if (h.getDia().equals(diaSemana)) {
                    LocalTime actual = h.getHoraInicio();
                    while (!actual.isAfter(h.getHoraFin().minusMinutes(30))) {

                        // Verificar si ya está reservada
                        if (!citaReservada(medico, fecha, actual)) {
                            disponibles.add(new HorarioCitaDTO(fecha, actual));
                        }

                        actual = actual.plusMinutes(30); // Tamaño de bloque
                    }
                }
            }
        }

        return disponibles;
    }

    // Auxiliar para verificar si un horario ya está ocupado
    private boolean citaReservada(Medico medico, LocalDate fecha, LocalTime hora) {
        for (CitaMedica cita : citas) {
            if (cita.getMedico().getCedula().equals(medico.getCedula())
                    && cita.getFecha().equals(fecha)
                    && cita.getHora().equals(hora)) {
                return true;
            }
        }
        return false;
    }

    // MÉTODOS PARA CARGAR LISTAS MOCK
    private void mockPacientes() {
        pacientes = new ArrayList<>();
        
        pacientes.add(new Paciente("12345678", "CURP0012345", "Carlos", "Méndez", "García"));
        pacientes.add(new Paciente("23456789", "CURP0023456", "Ana", "López", "Martínez"));
        pacientes.add(new Paciente("34567890", "CURP0034567", "Jorge", "Ramírez", "Santos"));
        pacientes.add(new Paciente("45678901", "CURP0045678", "María", "Hernández", "Pérez"));
        pacientes.add(new Paciente("56789012", "CURP0056789", "Luis", "Gómez", "Vega"));
        pacientes.add(new Paciente("67890123", "CURP0067890", "Sofía", "Torres", "Molina"));
        pacientes.add(new Paciente("78901234", "CURP0078901", "Ricardo", "Castillo", "Ortiz"));
        pacientes.add(new Paciente("89012345", "CURP0089012", "Paola", "Rojas", "Fernández"));
        pacientes.add(new Paciente("90123456", "CURP0090123", "Miguel", "Sánchez", "Domínguez"));
        pacientes.add(new Paciente("01234567", "CURP0101234", "Lucía", "Vargas", "Gutiérrez"));
    }
    
    private void mockMedicos() {
        medicos = new ArrayList<>();

        // Horarios ejemplo
        List<HorarioConsulta> horarios1 = Arrays.asList(
                new HorarioConsulta(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(12, 0)),
                new HorarioConsulta(DayOfWeek.WEDNESDAY, LocalTime.of(14, 0), LocalTime.of(17, 0))
        );

        List<HorarioConsulta> horarios2 = Arrays.asList(
                new HorarioConsulta(DayOfWeek.TUESDAY, LocalTime.of(10, 0), LocalTime.of(13, 0)),
                new HorarioConsulta(DayOfWeek.THURSDAY, LocalTime.of(15, 0), LocalTime.of(18, 0))
        );

        List<HorarioConsulta> horarios3 = Arrays.asList(
                new HorarioConsulta(DayOfWeek.FRIDAY, LocalTime.of(8, 0), LocalTime.of(12, 0))
        );

        medicos.add(new Medico("MED001", "Cardiología", "101", horarios1, "Alejandro", "Gómez", "Pérez"));
        medicos.add(new Medico("MED002", "Dermatología", "102", horarios2, "Valeria", "Martínez", "Santos"));
        medicos.add(new Medico("MED003", "Pediatría", "103", horarios3, "Javier", "Ramírez", "López"));
        medicos.add(new Medico("MED004", "Neurología", "104", horarios1, "Carolina", "Hernández", "Vega"));
        medicos.add(new Medico("MED005", "Ginecología", "105", horarios2, "Diego", "Torres", "Molina"));
    }
}
