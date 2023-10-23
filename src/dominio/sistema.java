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
public class sistema {

    ArrayList<postulante> listaPostulantes;
    ArrayList<evaluador> listaEvaluadores;
    ArrayList<tematica> listaTematicas;
    ArrayList<puesto> listaPuestos;
    ArrayList<entrevista> listaEntrevistas;

    public sistema() {
        listaPostulantes = new ArrayList<>();
        listaEvaluadores = new ArrayList<>();
        listaTematicas = new ArrayList<>();
        listaPuestos = new ArrayList<>();
        listaEntrevistas = new ArrayList<>();
    }

    public void agregarTematica(tematica nuevaTematica) {
        listaTematicas.add(nuevaTematica);
    }

    public void agregarPostulante(postulante nuevoPostulante) {
        listaPostulantes.add(nuevoPostulante);
    }

    public void eliminarPostulante(postulante nuevoPostulante) {
        listaPostulantes.remove(nuevoPostulante);
    }

}
