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
import java.util.*;
import javax.swing.JOptionPane;

public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String estado = " ";
        String opcion = " ";
        ArrayList<Detectives> lista = new ArrayList();
        ArrayList lista2 = new ArrayList();
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Bienvenido al sistema usuario! Porfavor haga una eleccion: \n"
                    + "1- Agregar un detective al archivo."
                    + "2- Modificar un detective existente."
                    + "3- Eliminar un detective del sistema."
                    + "4- Hacer LogIn."
                    + "5- Salir del sistema.");
            if (opcion.equalsIgnoreCase("1")) {
                String nombre, lugar, user, contra;
                int edad, labor, level;
                nombre = JOptionPane.showInputDialog("Ingrese su nombre porfavor: ");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad actual: "));
                lugar = JOptionPane.showInputDialog("Ingrese su lugar de nacimiento: ");
                labor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tiempo laborando"));
                level = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nivel de sistema: "));
                user = (JOptionPane.showInputDialog("Ingrese su nuevo usuario: "));
                contra = JOptionPane.showInputDialog("Ingrese su nueva contra: ");
                lista.add(new Detectives(nombre, edad, lugar, labor, level, user, contra));
            }
            if (opcion.equalsIgnoreCase("2")) {
                int parametro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un espacio a modificar: \n"
                        + "\n 0- Nombre"
                        + "\n 1- Edad: "
                        + "\n 2- Nacionalidad:"
                        + "\n 3- Tiempo laborando:"
                        + "\n 4- Nivel administrativo:"
                        + "\n 5- Usuario: "
                        + "\n 6- Contra"));
                if (parametro >= 0 && parametro < lista.size() && lista.get(parametro) instanceof Detectives) {
                    if (parametro == 0) {
                        String nombre = JOptionPane.showInputDialog("Nuevo nombre");
                        ((Detectives) lista.get(parametro)).setNombre(nombre);
                    }
                    if (parametro == 1) {
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su nueva edad: "));
                        ((Detectives) lista.get(parametro)).setEdad(edad);
                    }
                    if (parametro == 2) {
                       String nacion = JOptionPane.showInputDialog("Ingrese su nueva nacionalidad porfavor: ");
                        ((Detectives) lista.get(parametro)).setLugar(nacion);
                    }
                    if (parametro == 3) {
                       int laborando = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el tiempo trabajando: "));
                        ((Detectives) lista.get(parametro)).setEdad(laborando);
                    }
                    if (parametro == 4) {
                         int nivel = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese su nivel ejecutivo: "));
                        ((Detectives) lista.get(parametro)).setEdad(nivel);
                    }
                    if (parametro == 5) {
                       String usuario = JOptionPane.showInputDialog("Ingrese su nuevo username: ");
                        ((Detectives) lista.get(parametro)).setNombre(usuario);
                    }
                    if (parametro == 6) {
                        String contra = JOptionPane.showInputDialog("Ingrese su nueva contra: ");
                        ((Detectives) lista.get(parametro)).setNombre(contra);
                    }
                }
            }
            if (opcion.equalsIgnoreCase("3")) {

            }
            if (opcion.equalsIgnoreCase("4")) {

            }
            if (opcion.equalsIgnoreCase("5")) {
                System.exit(0);
            }
        }
    }
}
}
