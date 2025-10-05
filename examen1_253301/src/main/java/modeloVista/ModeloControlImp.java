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
import mappers.MedicoMapper;
import mappers.PacienteMapper;
import modeloNegocio.IModeloNegocio;
import modeloNegocio.ModeloNegocioImp;
import modeloNegocio.Paciente;

/**
 *
 * @author rocha
 */
public class ModeloControlImp {

    private IModeloNegocio modeloNegocio;

    public ModeloControlImp() {
        this.modeloNegocio = new ModeloNegocioImp();
    }

    public PacienteDTO obtenerPaciente(String nss) {
        Paciente paciente = modeloNegocio.obtenerPaciente(nss);
        
        if (paciente == null) {
            return null;
        }
        return PacienteMapper.toDTO(paciente);
    }

    public List<MedicoDTO> obtenerMedicos() {
        return MedicoMapper.toDTOList(modeloNegocio.obtenerMedicos());
    }
    
    public MedicoConCitasDTO obtenerMedico(String cedula) {
        MedicoDTO medico = MedicoMapper.toDTO(modeloNegocio.obtenerMedico(cedula));
        
        List<HorarioCitaDTO> citas = modeloNegocio.obtenerCitasDisponibles(cedula);
        
        return new MedicoConCitasDTO(medico, citas);
    }
}
