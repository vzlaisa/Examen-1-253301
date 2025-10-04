/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author rocha
 */
public class MediadorFlujo {

    private static MediadorFlujo instance;

    private FrameBusquedaPaciente busquedaPacienteFrm;
    private FrameRegistrarCita registrarCitaFrm;

    private MediadorFlujo() {

    }

    public static MediadorFlujo getInstance() {
        if (instance == null) {
            instance = new MediadorFlujo();
        }

        return instance;
    }

    public void abrirBusquedaPacienteFrm() {
        if (busquedaPacienteFrm == null) {
            busquedaPacienteFrm = new FrameBusquedaPaciente();
        }

        busquedaPacienteFrm.setVisible(true);
    }

    public void abrirRegistrarCitaFrm() {
        if (registrarCitaFrm == null) {
            registrarCitaFrm = new FrameRegistrarCita();
        }

        registrarCitaFrm.setVisible(true);
    }
}
