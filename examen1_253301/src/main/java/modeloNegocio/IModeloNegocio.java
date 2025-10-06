/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modeloNegocio;

import dto.HorarioCitaDTO;
import java.util.List;

/**
 * Interfaz que define las operaciones del modelo de negocio.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public interface IModeloNegocio {

    /**
     * Busca y devuelve un paciente a partir de su número de seguridad social.
     *
     * @param nss Número de Seguridad Social del paciente.
     * @return Paciente encontrado, o null si no existe.
     */
    public Paciente obtenerPaciente(String nss);

    /**
     * Obtiene la lista de todos los médicos registrados en el sistema.
     *
     * @return Lista de objetos Medico.
     */
    public List<Medico> obtenerMedicos();

    /**
     * Busca y devuelve un médico a partir de su cédula profesional.
     *
     * @param cedula Cédula profesional del médico.
     * @return Medico encontrado, o null si no existe.
     */
    public Medico obtenerMedico(String cedula);

    /**
     * Obtiene la lista de citas disponibles en la agenda de un médico
     * identificado por su cédula.
     *
     * @param cedula Cédula profesional del médico.
     * @return Lista de objetos HorarioCitaDTO con las citas disponibles.
     */
    public List<HorarioCitaDTO> obtenerCitasDisponibles(String cedula);

    /**
     * Registra una cita médica en el sistema.
     *
     * @param cita Objeto CitaMedica que contiene la información de la cita a
     * registrar.
     * @return La cita médica registrada con los datos confirmados.
     */
    public CitaMedica registrarCita(CitaMedica cita);
}
