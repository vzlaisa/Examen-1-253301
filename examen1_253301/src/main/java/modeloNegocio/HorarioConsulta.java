/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Representa un horario de consulta de un médico.
 *
 * Indica el día de la semana y la franja horaria en la que atiende pacientes.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class HorarioConsulta {

    /**
     * Día de la semana en el que el médico atiende
     */
    private DayOfWeek dia;

    /**
     * Hora de inicio de la consulta
     */
    private LocalTime horaInicio;

    /**
     * Hora de fin de la consulta
     */
    private LocalTime horaFin;

    /**
     * Constructor por defecto.
     */
    public HorarioConsulta() {
    }

    /**
     * Constructor que inicializa el horario completo.
     *
     * @param dia día de la semana
     * @param horaInicio hora de inicio
     * @param horaFin hora de fin
     */
    public HorarioConsulta(DayOfWeek dia, LocalTime horaInicio, LocalTime horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    /**
     * Obtiene el día de la semana.
     *
     * @return día de la consulta
     */
    public DayOfWeek getDia() {
        return dia;
    }

    /**
     * Asigna el día de la semana.
     *
     * @param dia nuevo día
     */
    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    /**
     * Obtiene la hora de inicio.
     *
     * @return hora de inicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * Asigna la hora de inicio.
     *
     * @param horaInicio nueva hora de inicio
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Obtiene la hora de fin.
     *
     * @return hora de fin
     */
    public LocalTime getHoraFin() {
        return horaFin;
    }

    /**
     * Asigna la hora de fin.
     *
     * @param horaFin nueva hora de fin
     */
    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
