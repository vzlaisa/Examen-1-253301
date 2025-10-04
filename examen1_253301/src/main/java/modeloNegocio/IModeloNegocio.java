/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modeloNegocio;

import dto.MedicoConCitasDTO;
import java.util.List;

/**
 *
 * @author rocha
 */
public interface IModeloNegocio {

    public Paciente obtenerPaciente(String nss);

    public List<Medico> obtenerMedicos();

    public Medico obtenerMedico(String cedula);

    public CitaMedica registrarCita(CitaMedica cita);
}
