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
import mappers.CitaMapper;
import mappers.MedicoMapper;
import mappers.PacienteMapper;
import modeloNegocio.IModeloNegocio;
import modeloNegocio.ModeloNegocioImp;
import modeloNegocio.Paciente;

/**
 * Implementación del modelo de control.
 * 
 * Se encarga de comunicarse con el modelo de negocio y
 * transformar las entidades a DTO mediante los mappers.
 * 
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class ModeloControlImp {

    private IModeloNegocio modeloNegocio;

    /**
     * Constructor de la clase.
     * Inicializa la referencia al modelo de negocio.
     */
    public ModeloControlImp() {
        this.modeloNegocio = new ModeloNegocioImp();
    }

    /**
     * Obtiene un paciente desde el modelo de negocio y lo transforma a DTO.
     * 
     * @param nss número de seguridad social
     * @return PacienteDTO o null si no existe
     */
    public PacienteDTO obtenerPaciente(String nss) {
        Paciente paciente = modeloNegocio.obtenerPaciente(nss);
        if (paciente == null) {
            return null;
        }
        return PacienteMapper.toDTO(paciente);
    }

    /**
     * Devuelve la lista de médicos en formato DTO.
     * 
     * @return lista de MedicoDTO
     */
    public List<MedicoDTO> obtenerMedicos() {
        return MedicoMapper.toDTOList(modeloNegocio.obtenerMedicos());
    }
    
    /**
     * Obtiene un médico por su cédula y las citas disponibles.
     * Devuelve un objeto combinado con la información del médico y sus horarios.
     * 
     * @param cedula cédula profesional del médico
     * @return MedicoConCitasDTO
     */
    public MedicoConCitasDTO obtenerMedico(String cedula) {
        MedicoDTO medico = MedicoMapper.toDTO(modeloNegocio.obtenerMedico(cedula));
        List<HorarioCitaDTO> citas = modeloNegocio.obtenerCitasDisponibles(cedula);
        return new MedicoConCitasDTO(medico, citas);
    }
    
    /**
     * Registra una cita médica en el modelo de negocio.
     * Convierte el DTO a entidad y viceversa.
     * 
     * @param cita objeto CitaMedicaDTO
     * @return cita registrada como CitaMedicaDTO
     */
    public CitaMedicaDTO registrarCita(CitaMedicaDTO cita) {
        return CitaMapper.toDTO(modeloNegocio.registrarCita(CitaMapper.toEntity(cita)));
    }
}
