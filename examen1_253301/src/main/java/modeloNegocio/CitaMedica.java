/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Representa una cita médica dentro del sistema.
 *
 * Contiene la información del paciente, el médico asignado, así como la fecha y
 * hora de la cita.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class CitaMedica {

    /**
     * Paciente que tiene la cita médica
     */
    private Paciente paciente;

    /**
     * Médico con el que se agenda la cita
     */
    private Medico medico;

    /**
     * Fecha en la que se realizará la cita
     */
    private LocalDate fecha;

    /**
     * Hora en la que se realizará la cita
     */
    private LocalTime hora;

    /**
     * Constructor por defecto.
     */
    public CitaMedica() {
    }

    /**
     * Constructor que inicializa todos los atributos de la cita médica.
     *
     * @param paciente Paciente de la cita
     * @param medico Médico de la cita
     * @param fecha Fecha de la cita
     * @param hora Hora de la cita
     */
    public CitaMedica(Paciente paciente, Medico medico, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    /**
     * Obtiene el paciente.
     *
     * @return paciente de la cita
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Asigna el paciente.
     *
     * @param paciente nuevo paciente
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Obtiene el médico.
     *
     * @return médico de la cita
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Asigna el médico.
     *
     * @param medico nuevo médico
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * Obtiene la fecha.
     *
     * @return fecha de la cita
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Asigna la fecha.
     *
     * @param fecha nueva fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora.
     *
     * @return hora de la cita
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Asigna la hora.
     *
     * @param hora nueva hora
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * Representación en texto de la cita médica.
     *
     * @return cadena con paciente, médico, fecha y hora
     */
    @Override
    public String toString() {
        return "CitaMedica{" + "paciente=" + paciente + ", medico=" + medico + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
}
