/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

import dto.MedicoDTO;
import dto.PacienteDTO;

/**
 *
 * @author rocha
 */
public class SesionSeleccion {
    private PacienteDTO paciente;
    private MedicoDTO medico;
    
    private static SesionSeleccion instance;
    
    private SesionSeleccion() {
        
    }
    
    public static SesionSeleccion getInstance() {
        if (instance == null) {
            instance = new SesionSeleccion();
        }
        
        return instance;
    }

    public PacienteDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDTO paciente) {
        this.paciente = paciente;
    }

    public MedicoDTO getMedico() {
        return medico;
    }

    public void setMedico(MedicoDTO medico) {
        this.medico = medico;
    }
    
}
