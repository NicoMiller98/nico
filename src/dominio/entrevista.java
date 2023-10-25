/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Daniel Abudara y Nicolas Miller
 */
public class entrevista {

    private evaluador evaluador;
    private postulante postulante;
    private int puntaje;
    private String comentarios;
    private int numeroCorrelativo;

    
    public entrevista(evaluador evaluador, postulante postulante, int puntaje, String comentarios, int numeroCorrelativo) {
        this.evaluador = evaluador;
        this.postulante = postulante;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(postulante postulante) {
        this.postulante = postulante;
    }

    public int getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(int numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
