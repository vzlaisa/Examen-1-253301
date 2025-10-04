/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.List;

/**
 *
 * @author rocha
 */
public class MedicoConCitasDTO {
    private MedicoDTO medico;
    private List<HorarioCitaDTO> citasDisponibles;

    public MedicoConCitasDTO() {
    }

    public MedicoConCitasDTO(MedicoDTO medico, List<HorarioCitaDTO> citasDisponibles) {
        this.medico = medico;
        this.citasDisponibles = citasDisponibles;
    }

    public MedicoDTO getMedico() {
        return medico;
    }

    public void setMedico(MedicoDTO medico) {
        this.medico = medico;
    }

    public List<HorarioCitaDTO> getCitasDisponibles() {
        return citasDisponibles;
    }

    public void setCitasDisponibles(List<HorarioCitaDTO> citasDisponibles) {
        this.citasDisponibles = citasDisponibles;
    }
    
    
}
