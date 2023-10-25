/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Daniel Abudara y Nicolas Miller
 */
public class evaluador extends persona {

    //mejor poner cedula como string
    public evaluador(String nombre, String cedula, String direccion, int añoDeIngreso) {
        super(nombre, cedula, direccion);  // Llama al constructor de la clase base persona en el contexto de herencia. (super refiere a superclase)
        this.añoDeIngreso = añoDeIngreso;
    }

    private int añoDeIngreso;
    
    //no poner ñ!!!!!!!!!!
    public int getAnioDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }
}
