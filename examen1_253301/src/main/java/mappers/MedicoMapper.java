/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mappers;

import dto.MedicoConCitasDTO;
import dto.MedicoDTO;
import java.util.List;
import java.util.stream.Collectors;
import modeloNegocio.Medico;

/**
 *
 * @author rocha
 */
public class MedicoMapper {
    
    public static MedicoDTO toDTO(Medico medico) {
        return new MedicoDTO(
                medico.getNombreCompleto(), 
                medico.getCedula(), 
                medico.getEspecialidad(), 
                medico.getConsultorio(), 
                HorarioMapper.toDTOList(medico.getHorarios()));
    }
    
    public static List<MedicoDTO> toDTOList(List<Medico> medicos) {
        return medicos.stream()
                .map(medico -> toDTO(medico))
                .collect(Collectors.toList());
    }
}
