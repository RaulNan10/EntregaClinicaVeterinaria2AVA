package gestion;

import java.io.Serializable;
/**
 * Se declaran los atributos de la clase
 * @author jnan
 *
 */
public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
/**
 * Constructor de persona
 * @param nombre Nombre de la persona
 * @param apellidos Apellidos de la persona
 * @param dni DNI de la persona
 * @param edad Edad de la persona
 */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
/**
 * 
 * @return Nombre de la persona
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre Define el nombre de la persona
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return Apellidos de la persona
 */
    public String getApellidos() {
        return apellidos;
    }
/**
 * 
 * @param apellidos Definde los apellidos de la persona
 */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
/**
 * 
 * @return El dni de la persona
 */
    public String getDni() {
        return dni;
    }
/**
 * 
 * @param dni Define el dni de la persona
 */
    public void setDni(String dni) {
        this.dni = dni;
    }
/**
 * 
 * @return La edad
 */
    public int getEdad() {
        return edad;
    }
/**
 * Define la edad de la persona
 * @param edad Edad a definir
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * Devuelve la edad de la persona a partir del año actual
 * @param anyoactual Año
 * @return La edad 
 */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    /**
     * Sobreescribe el toString del objecto
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}