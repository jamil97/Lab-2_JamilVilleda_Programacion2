/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Jamil
 */
public class Evidencia {

    private String nombre;
    private String descripcion;
    private String nivel;

    public Evidencia() {

    }

    public Evidencia(String nombre, String descripcion, String nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + " Descripcion: " + descripcion + " Nivel: " + nivel;
    }
}
