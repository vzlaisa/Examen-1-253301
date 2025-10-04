/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

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
    
    public ModeloControlFacade() {
        this.modeloControlImp = new ModeloControlImp();
    }
    
    @Override
    public PacienteDTO obtenerPaciente(String nss) {
        return null;
    }

    @Override
    public List<MedicoDTO> obtenerMedicos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MedicoConCitasDTO obtenerMedico(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarCita(HorarioCitaDTO horario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
