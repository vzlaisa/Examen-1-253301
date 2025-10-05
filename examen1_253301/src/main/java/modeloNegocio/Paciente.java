/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

/**
 *
 * @author rocha
 */
public class Paciente extends Persona {
    private String nss;
    private String curp;

    public Paciente() {
    }

    public Paciente(String nss, String curp, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.nss = nss;
        this.curp = curp;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nss=" + nss + ", curp=" + curp + '}';
    }
    
    
}
