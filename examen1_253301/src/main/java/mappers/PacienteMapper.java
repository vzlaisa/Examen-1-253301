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
                paciente.getNombreCompleto(),
                paciente.getNss(),
                paciente.getCurp());
    }

}
