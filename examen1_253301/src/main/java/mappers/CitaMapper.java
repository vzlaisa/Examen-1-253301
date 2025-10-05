/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mappers;

import dto.CitaMedicaDTO;
import modeloNegocio.CitaMedica;

/**
 *
 * @author rocha
 */
public class CitaMapper {
    
    public static CitaMedicaDTO toDTO(CitaMedica cita) {
        return new CitaMedicaDTO(
                PacienteMapper.toDTO(cita.getPaciente()),
                MedicoMapper.toDTO(cita.getMedico()),
                cita.getFecha(),
                cita.getHora());
    }
    
    public static CitaMedica toEntity(CitaMedicaDTO cita) {
        return new CitaMedica(
                PacienteMapper.toEntity(cita.getPaciente()),
                MedicoMapper.toEntity(cita.getMedico()), 
                cita.getFecha(), 
                cita.getHora()
        );
    }

}
