/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import java.util.List;

/**
 *
 * @author rocha
 */
public class Medico extends Persona {
    private String cedula;
    private String especialidad;
    private String consultorio;
    private List<HorarioConsulta> horarios;

    public Medico() {
    }

    public Medico(String cedula, String especialidad, String consultorio, List<HorarioConsulta> horarios, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.horarios = horarios;
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

    public List<HorarioConsulta> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioConsulta> horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return "Medico{" + "cedula=" + cedula + ", especialidad=" + especialidad + ", consultorio=" + consultorio + '}';
    }
    
}
