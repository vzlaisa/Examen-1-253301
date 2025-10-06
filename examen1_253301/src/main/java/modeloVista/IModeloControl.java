/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modeloVista;

import dto.CitaMedicaDTO;
import dto.HorarioCitaDTO;
import dto.MedicoConCitasDTO;
import dto.MedicoDTO;
import dto.PacienteDTO;
import java.util.List;

/**
 * Define las operaciones del modelo de la vista.
 *
 * Este modelo sirve de puente entre la vista y el modelo de negocio.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public interface IModeloControl {

    /**
     * Obtiene los datos de un paciente a partir de su NSS.
     *
     * @param nss número de seguridad social del paciente
     * @return objeto PacienteDTO con la información del paciente
     */
    public PacienteDTO obtenerPaciente(String nss);

    /**
     * Devuelve la lista de médicos disponibles.
     *
     * @return lista de objetos MedicoDTO
     */
    public List<MedicoDTO> obtenerMedicos();

    /**
     * Busca un médico por su cédula profesional.
     *
     * @param cedula cédula profesional del médico
     * @return objeto MedicoConCitasDTO con información del médico y sus citas
     */
    public MedicoConCitasDTO obtenerMedico(String cedula);

    /**
     * Registra una nueva cita médica para un horario dado.
     *
     * @param horario objeto HorarioCitaDTO que contiene los datos del horario
     * @return objeto CitaMedicaDTO con la cita registrada
     */
    public CitaMedicaDTO registrarCita(HorarioCitaDTO horario);
}
