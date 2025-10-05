/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

import dto.CitaMedicaDTO;
import dto.HorarioCitaDTO;
import dto.MedicoConCitasDTO;
import dto.MedicoDTO;
import dto.PacienteDTO;
import java.util.List;

/**
 *
 * @author rocha
 */
public class ModeloControlFacade implements IModeloControl {

    private ModeloControlImp modeloControlImp;
    private SesionSeleccion sesion;
    
    private static ModeloControlFacade instance;
    
    private ModeloControlFacade() {
        this.modeloControlImp = new ModeloControlImp();
        this.sesion = SesionSeleccion.getInstance();
    }
    
    public static ModeloControlFacade getInstance() {
        if (instance == null) {
            instance = new ModeloControlFacade();
        }
        
        return instance;
    }
    
    @Override
    public PacienteDTO obtenerPaciente(String nss) {
        PacienteDTO paciente = modeloControlImp.obtenerPaciente(nss);
        
        if (paciente != null) {
            sesion.setPaciente(paciente);
        }
        
        return paciente;
    }

    @Override
    public List<MedicoDTO> obtenerMedicos() {
        return modeloControlImp.obtenerMedicos();
    }

    @Override
    public MedicoConCitasDTO obtenerMedico(String cedula) {
        MedicoConCitasDTO medico = modeloControlImp.obtenerMedico(cedula);
        
        if (medico != null) {
            sesion.setMedico(medico.getMedico());
        }
        
        return medico;
    }

    @Override
    public CitaMedicaDTO registrarCita(HorarioCitaDTO horario) {
        PacienteDTO paciente = sesion.getPaciente();
        MedicoDTO medico = sesion.getMedico();
        CitaMedicaDTO cita = new CitaMedicaDTO(paciente, medico, horario.getFecha(), horario.getHora());
        
        return modeloControlImp.registrarCita(cita);
    }
    
}
