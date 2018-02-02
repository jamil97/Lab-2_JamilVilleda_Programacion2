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
                    + "1- Agregar un detective al archivo. \n"
                    + "2- Modificar un detective existente. \n"
                    + "3- Eliminar un detective del sistema. \n"
                    + "4- Hacer LogIn. \n"
                    + "5- Salir del sistema. \n");
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
                        + "0- Nombre: \n"
                        + "1- Edad: \n"
                        + "2- Nacionalidad: \n"
                        + "3- Tiempo laborando: \n"
                        + "4- Nivel administrativo: \n"
                        + "5- Usuario: \n"
                        + "6- Contra: \n"));
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
                int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion de detective a eliminar"));
                lista.remove(p);
            }

            if (opcion.equalsIgnoreCase("4")) {
                String user1 = (JOptionPane.showInputDialog("Ingrese su Usuario: "));
                String contra1 = (JOptionPane.showInputDialog("Ingrese su Contraseña: "));
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getUser().equals(user1) && lista.get(i).getContra().equals(contra1)) { //Validacion de que el usuario este
                        String opcion1 = " ";
                        while (!opcion1.equalsIgnoreCase("g")) { //Valida que haga log out
                            opcion1 = JOptionPane.showInputDialog(""
                                    + "a- Listar todos sus Datos\n"
                                    + "b- Registar sus casos\n"
                                    + "c- Modificar sus casos\n"
                                    + "d- Listar sus Casos\n"
                                    + "e- Enviar Mensaje\n"
                                    + "f- Listar Mensajes\n"
                                    + "g- Log Out\n");

                            if (opcion1.equalsIgnoreCase("a")) {
                                String hola = " ";
                                for (Object t : lista) {
                                    if (t instanceof Detectives) {
                                        hola += lista.indexOf(t);
                                        hola += t + " \n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, hola);
                            }

                            if (opcion1.equalsIgnoreCase("b")) {
                                String lugar, descripcion, tipo, detective1, nombre, descripcionevidencia, nivelevidencia;
                                lugar = (JOptionPane.showInputDialog("Ingrese Lugar del crimen: "));
                                descripcion = (JOptionPane.showInputDialog("Describa el caso: "));
                                tipo = (JOptionPane.showInputDialog("Ingrese el tipo de delito \n (Homicidio \n ,Robo \n ,Secuestro \n ,Violacion \n) "));
                                detective1 = (JOptionPane.showInputDialog("Ingrese el detective: "));
                                estado = (JOptionPane.showInputDialog("Ingrese el estado del crimen \n (Procesado \n, Resuelto \n) "));
                                nombre = (JOptionPane.showInputDialog("Ingrese nombre de la evidencia: "));
                                descripcionevidencia = (JOptionPane.showInputDialog("Describa la evidencia: "));
                                nivelevidencia = (JOptionPane.showInputDialog("Ingrese nivel de evidencia: "));
                                lista2.add(new Casos(lugar, descripcion, tipo, detective1, estado));
                                lista2.add(new Evidencia(nombre, descripcionevidencia, nivelevidencia));
                            }
                            if (opcion1.equalsIgnoreCase("c")) {
                                int pos1 = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese la Posicion del Caso: "));
                                String lugar, descripcion, tipo, detec;
                                lugar = (JOptionPane.showInputDialog("Ingrese Lugar: "));
                                descripcion = (JOptionPane.showInputDialog("Ingrese Descripcion del Caso: "));
                                tipo = (JOptionPane.showInputDialog("Ingrese el Tipo de Caso[Homicidio,Robo,Secuestro,Violacion]: "));
                                detec = (JOptionPane.showInputDialog("Ingrese el Detective a Cargo: "));
                                estado = (JOptionPane.showInputDialog("Ingrese el Estado del Caso[Proceso, Resuelto]: "));
                                ((Casos) lista2.get(pos1)).setLugar(lugar);
                                ((Casos) lista2.get(pos1)).setDescripcion(descripcion);
                                ((Casos) lista2.get(pos1)).setTipo_hom(tipo);
                                ((Casos) lista2.get(pos1)).setDetec(detec);
                                ((Casos) lista2.get(pos1)).setEstado(estado);
                            }

                            if (opcion1.equalsIgnoreCase("d")) {
                                String lol = "";
                                for (Object t : lista2) {
                                    if (t instanceof Casos) {
                                        lol += lista2.indexOf(t) + " " + ((Casos) t) + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, lol);
                            }

                            if (opcion1.equalsIgnoreCase("e")) {

                            }
                            if (opcion1.equalsIgnoreCase("f")) {

                            }
                            if (opcion1.equalsIgnoreCase("g")) {

                            }
                        }
                    }
                }
            }

            if (opcion.equalsIgnoreCase("5")) {
                System.exit(0);
            }
        }
    }
}
