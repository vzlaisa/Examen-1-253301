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
public class MedicoDTO {
    private String nombreCompleto;
    private String cedula;
    private String especialidad;
    private String consultorio;
    private List<HorarioConsultaDTO> horarios;

    public MedicoDTO() {
    }

    public MedicoDTO(String nombreCompleto, String cedula, String especialidad, String consultorio, List<HorarioConsultaDTO> horarios) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.horarios = horarios;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public List<HorarioConsultaDTO> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioConsultaDTO> horarios) {
        this.horarios = horarios;
    }

}
