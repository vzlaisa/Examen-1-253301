/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author rocha
 */
public class CitaMedica {
    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;
    private LocalTime hora;

    public CitaMedica() {
    }

    public CitaMedica(Paciente paciente, Medico medico, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "paciente=" + paciente + ", medico=" + medico + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
}
