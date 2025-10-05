/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface IModeloControl {

    public PacienteDTO obtenerPaciente(String nss);

    public List<MedicoDTO> obtenerMedicos();

    public MedicoConCitasDTO obtenerMedico(String cedula);

    public CitaMedicaDTO registrarCita(HorarioCitaDTO horario);
}
