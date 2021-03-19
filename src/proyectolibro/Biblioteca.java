/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibro;
 
public class Biblioteca {
    private String nombre_biblioteca; 
    private int variabilidad_titulos;

    public Biblioteca() { 
    }

    public Biblioteca(String nombre_biblioteca, int variabilidad_titulos) {
        this.nombre_biblioteca = nombre_biblioteca;
        this.variabilidad_titulos = variabilidad_titulos;
    }

    public String getNombre_biblioteca() {
        return nombre_biblioteca;
    }

    public void setNombre_biblioteca(String nombre_biblioteca) {
        this.nombre_biblioteca = nombre_biblioteca;
    }

    public int getVariabilidad_titulos() {
        return variabilidad_titulos;
    }

    public void setVariabilidad_titulos(int variabilidad_titulos) {
        this.variabilidad_titulos = variabilidad_titulos;
    } 
}
