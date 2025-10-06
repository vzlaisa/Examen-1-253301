/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

import dto.CitaMedicaDTO;
import dto.HorarioCitaDTO;
import dto.MedicoConCitasDTO;
import dto.MedicoDTO;
import dto.PacienteDTO;
import java.util.List;

/**
 * Fachada del modelo de la vista.
 *
 * Aplica el patrón Singleton para asegurar una sola instancia. Mantiene la
 * sesión del paciente y médico seleccionados, y delega las operaciones al
 * ModeloControlImp.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class ModeloControlFacade implements IModeloControl {

    private ModeloControlImp modeloControlImp;
    private SesionSeleccion sesion;

    private static ModeloControlFacade instance;

    /**
     * Constructor privado para el patrón Singleton. Inicializa la
     * implementación del modelo y la sesión.
     */
    private ModeloControlFacade() {
        this.modeloControlImp = new ModeloControlImp();
        this.sesion = SesionSeleccion.getInstance();
    }

    /**
     * Devuelve la única instancia de la fachada.
     *
     * @return instancia de ModeloControlFacade
     */
    public static ModeloControlFacade getInstance() {
        if (instance == null) {
            instance = new ModeloControlFacade();
        }
        return instance;
    }

    /**
     * Obtiene un paciente por NSS y lo guarda en la sesión.
     *
     * @param nss número de seguridad social
     * @return objeto PacienteDTO o null si no existe
     */
    @Override
    public PacienteDTO obtenerPaciente(String nss) {
        PacienteDTO paciente = modeloControlImp.obtenerPaciente(nss);
        if (paciente != null) {
            sesion.setPaciente(paciente);
        }
        return paciente;
    }

    /**
     * Devuelve la lista de médicos disponibles.
     *
     * @return lista de MedicoDTO
     */
    @Override
    public List<MedicoDTO> obtenerMedicos() {
        return modeloControlImp.obtenerMedicos();
    }

    /**
     * Obtiene un médico por cédula y lo guarda en la sesión.
     *
     * @param cedula cédula profesional
     * @return objeto MedicoConCitasDTO o null si no existe
     */
    @Override
    public MedicoConCitasDTO obtenerMedico(String cedula) {
        MedicoConCitasDTO medico = modeloControlImp.obtenerMedico(cedula);
        if (medico != null) {
            sesion.setMedico(medico.getMedico());
        }
        return medico;
    }

    /**
     * Registra una cita para el paciente y médico guardados en la sesión,
     * usando el horario dado.
     *
     * @param horario objeto HorarioCitaDTO
     * @return objeto CitaMedicaDTO con la cita registrada
     */
    @Override
    public CitaMedicaDTO registrarCita(HorarioCitaDTO horario) {
        PacienteDTO paciente = sesion.getPaciente();
        MedicoDTO medico = sesion.getMedico();
        CitaMedicaDTO cita = new CitaMedicaDTO(paciente, medico, horario.getFecha(), horario.getHora());
        return modeloControlImp.registrarCita(cita);
    }
}
