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
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String cedula;
    private String especialidad;
    private String consultorio;
    private List<HorarioConsultaDTO> horarios;

    public MedicoDTO() {
    }

    public MedicoDTO(String nombre, String apellidoPaterno, String apellidoMaterno, String cedula, String especialidad, String consultorio, List<HorarioConsultaDTO> horarios) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.horarios = horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
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
