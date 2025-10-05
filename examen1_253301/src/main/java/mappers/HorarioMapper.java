/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mappers;

import dto.HorarioConsultaDTO;
import java.util.List;
import java.util.stream.Collectors;
import modeloNegocio.HorarioConsulta;

/**
 *
 * @author rocha
 */
public class HorarioMapper {
    
    public static HorarioConsultaDTO toDTO(HorarioConsulta horarioConsulta) {
        return new HorarioConsultaDTO(
                horarioConsulta.getDia(),
                horarioConsulta.getHoraInicio(),
                horarioConsulta.getHoraFin()
        );
    }
    
    public static List<HorarioConsultaDTO> toDTOList(List<HorarioConsulta> horarios) {
        return horarios.stream()
                .map(horario -> toDTO(horario))
                .collect(Collectors.toList());
    }
}
