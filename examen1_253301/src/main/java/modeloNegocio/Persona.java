/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

/**
 * Clase base que representa a una persona en el sistema.
 *
 * Esta clase sirve como superclase para otras entidades más específicas, como
 * Paciente o Médico.
 *
 * @author 00000253301 Isabel Valenzuela Rocha
 */
public class Persona {

    /**
     * Nombre de la persona
     */
    protected String nombre;

    /**
     * Apellido paterno de la persona
     */
    protected String apellidoPaterno;

    /**
     * Apellido materno de la persona
     */
    protected String apellidoMaterno;

    /**
     * Constructor por defecto.
     */
    public Persona() {
    }

    /**
     * Constructor que inicializa todos los atributos.
     *
     * @param nombre Nombre de la persona
     * @param apellidoPaterno Apellido paterno
     * @param apellidoMaterno Apellido materno
     */
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno.
     *
     * @return apellido paterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Asigna el apellido paterno.
     *
     * @param apellidoPaterno nuevo apellido paterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno.
     *
     * @return apellido materno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Asigna el apellido materno.
     *
     * @param apellidoMaterno nuevo apellido materno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Devuelve el nombre completo de la persona.
     *
     * @return nombre completo (nombre + apellidos)
     */
    public String getNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    /**
     * Representación en texto del objeto.
     *
     * @return cadena con los atributos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + '}';
    }
}
