/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Daniel Abudara y Nicolas Miller
 */
public class puesto {

    private String nombre;
    private String tipo;
    ArrayList<tematica> listaTemasRequeridos;

    public puesto(String nombre, String tipo, ArrayList<tematica> listaTemasRequeridos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaTemasRequeridos = listaTemasRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<tematica> getListaTemasRequeridos() {
        return listaTemasRequeridos;
    }

    public void setListaTemasRequeridos(ArrayList<tematica> listaTemasRequeridos) {
        this.listaTemasRequeridos = listaTemasRequeridos;
    }

}
