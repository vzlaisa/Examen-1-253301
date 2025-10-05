/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.CitaMedicaDTO;
import dto.HorarioCitaDTO;
import dto.MedicoConCitasDTO;
import dto.MedicoDTO;
import dto.PacienteDTO;
import java.util.List;
import modeloVista.IModeloControl;
import modeloVista.ModeloControlFacade;

/**
 *
 * @author rocha
 */
public class ControlAgendarCitaMedica {

    private static IModeloControl modeloControl = ModeloControlFacade.getInstance();

    public static PacienteDTO buscarPaciente(String nss) {
        if (modeloControl != null) {
            return modeloControl.obtenerPaciente(nss);
        } else {
            throw new IllegalStateException("ModeloControl no inicializado");
        }
    }
    
    public static List<MedicoDTO> obtenerMedicos() {
        if (modeloControl != null) {
            return modeloControl.obtenerMedicos();
        } else {
            throw new IllegalStateException("ModeloControl no inicializado");
        }
    }
    
    public static MedicoConCitasDTO obtenerMedico(String cedula) {
        if (modeloControl != null) {
            return modeloControl.obtenerMedico(cedula);
        } else {
            throw new IllegalStateException("ModeloControl no inicializado");
        }
    }
    
    public static CitaMedicaDTO registrarCita(HorarioCitaDTO horario) {
        if (modeloControl != null) {
            return modeloControl.registrarCita(horario);
        } else {
            throw new IllegalStateException("ModeloControl no inicializado");
        }
    }
}
