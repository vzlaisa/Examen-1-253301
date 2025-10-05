/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mappers;

import dto.PacienteDTO;
import modeloNegocio.Paciente;

/**
 *
 * @author rocha
 */
public class PacienteMapper {
    
    public static PacienteDTO toDTO(Paciente paciente) {
        return new PacienteDTO(
                paciente.getNombre(),
                paciente.getApellidoPaterno(),
                paciente.getApellidoMaterno(),
                paciente.getNss(),
                paciente.getCurp());
    }
    
    public static Paciente toEntity(PacienteDTO paciente) {
        return new Paciente(
                paciente.getNss(),
                paciente.getCurp(),
                paciente.getNombre(),
                paciente.getApellidoPaterno(),
                paciente.getApellidoMaterno()
        );
    }

}
