/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel Abudara y Nicolas Miller
 */
public class postulante extends persona {

    private int telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private Map<tematica, Integer> temasConocidos;  // Se utiliza un Map para gestionar los niveles de temas

    public postulante(String nombre, int cedula, String direccion, int telefono, String mail, String linkedin, String formato) {
        super(nombre, cedula, direccion);    // Llama al constructor de la clase base persona en el contexto de herencia. (super refiere a superclase)
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.temasConocidos = new HashMap<>();

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void agregarTemaConocido(tematica tematica, int nivel) {
        temasConocidos.put(tematica, nivel);
    }

    public void eliminarTemaConocido(tematica tematica) {
        temasConocidos.remove(tematica);
    }

    public int obtenerNivelDeTematica(tematica tematica) {   //obtenemos el valor que se asocia con esa temática específica.
        return temasConocidos.get(tematica);
    }

    public Map<tematica, Integer> getTemasConocidos() {
        return temasConocidos;
    }

    public void setTemasConocidos(Map<tematica, Integer> temasConocidos) {
        this.temasConocidos = temasConocidos;
    }
}
