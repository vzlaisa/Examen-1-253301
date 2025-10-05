/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

/**
 * Representa a un paciente del sistema, que hereda de la clase Persona.
 * Contiene información adicional como NSS y CURP.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class Paciente extends Persona {

    /**
     * Número de Seguridad Social del paciente
     */
    private String nss;

    /**
     * CURP del paciente
     */
    private String curp;

    /**
     * Constructor por defecto.
     */
    public Paciente() {
    }

    /**
     * Constructor que inicializa todos los atributos del paciente y de la
     * persona.
     *
     * @param nss Número de Seguridad Social
     * @param curp CURP del paciente
     * @param nombre Nombre del paciente
     * @param apellidoPaterno Apellido paterno
     * @param apellidoMaterno Apellido materno
     */
    public Paciente(String nss, String curp, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.nss = nss;
        this.curp = curp;
    }

    /**
     * Obtiene el NSS.
     *
     * @return Número de Seguridad Social
     */
    public String getNss() {
        return nss;
    }

    /**
     * Asigna el NSS.
     *
     * @param nss nuevo Número de Seguridad Social
     */
    public void setNss(String nss) {
        this.nss = nss;
    }

    /**
     * Obtiene la CURP.
     *
     * @return CURP del paciente
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Asigna la CURP.
     *
     * @param curp nueva CURP
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

    /**
     * Representación en texto del paciente.
     *
     * @return cadena con NSS y CURP
     */
    @Override
    public String toString() {
        return "Paciente{" + "nss=" + nss + ", curp=" + curp + '}';
    }
}
