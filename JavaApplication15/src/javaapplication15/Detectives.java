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
public class Detectives {

    private String nombre;
    private int edad;
    private String lugar;
    private int labor;
    private int level;
    private String user;
    private String contra;

    public Detectives(String nombre, int edad, String lugar, int labor, int level, String user, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar = lugar;
        this.labor = labor;
        this.level = level;
        this.user = user;
        this.contra = contra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLabor(int labor) {
        this.labor = labor;
    }

    public int getLabor() {
        return labor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
