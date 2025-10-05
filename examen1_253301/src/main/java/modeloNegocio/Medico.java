/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import java.util.List;

/**
 * Representa a un médico en el sistema, que hereda de la clase Persona.
 * 
 * Contiene información adicional como cédula profesional, especialidad,
 * consultorio y horarios de consulta.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class Medico extends Persona {

    /**
     * Número de cédula profesional del médico
     */
    private String cedula;

    /**
     * Especialidad médica del médico
     */
    private String especialidad;

    /**
     * Consultorio asignado al médico
     */
    private String consultorio;

    /**
     * Lista de horarios de consulta del médico
     */
    private List<HorarioConsulta> horarios;

    /**
     * Constructor por defecto.
     */
    public Medico() {
    }

    /**
     * Constructor que inicializa todos los atributos del médico y de la
     * persona.
     *
     * @param cedula Cédula profesional
     * @param especialidad Especialidad médica
     * @param consultorio Consultorio asignado
     * @param horarios Lista de horarios de consulta
     * @param nombre Nombre del médico
     * @param apellidoPaterno Apellido paterno
     * @param apellidoMaterno Apellido materno
     */
    public Medico(String cedula, String especialidad, String consultorio, List<HorarioConsulta> horarios, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.horarios = horarios;
    }

    /**
     * Obtiene la cédula profesional.
     *
     * @return cédula profesional
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Asigna la cédula profesional.
     *
     * @param cedula nueva cédula profesional
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene la especialidad.
     *
     * @return especialidad médica
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Asigna la especialidad.
     *
     * @param especialidad nueva especialidad médica
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene el consultorio.
     *
     * @return consultorio asignado
     */
    public String getConsultorio() {
        return consultorio;
    }

    /**
     * Asigna el consultorio.
     *
     * @param consultorio nuevo consultorio
     */
    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    /**
     * Obtiene la lista de horarios de consulta.
     *
     * @return lista de horarios
     */
    public List<HorarioConsulta> getHorarios() {
        return horarios;
    }

    /**
     * Asigna la lista de horarios de consulta.
     *
     * @param horarios nueva lista de horarios
     */
    public void setHorarios(List<HorarioConsulta> horarios) {
        this.horarios = horarios;
    }

    /**
     * Representación en texto del médico.
     *
     * @return cadena con cédula, especialidad y consultorio
     */
    @Override
    public String toString() {
        return "Medico{" + "cedula=" + cedula + ", especialidad=" + especialidad + ", consultorio=" + consultorio + '}';
    }
}
