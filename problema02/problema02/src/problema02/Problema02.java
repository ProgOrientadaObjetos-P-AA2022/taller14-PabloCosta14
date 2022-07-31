/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import Enlace.Enlace;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enlace e = new Enlace();
        /* Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean bandera = true;

        int opcion;
        

        while (bandera) {
            System.out.println("*****Ingrese Datos del estudiante*******");

            System.out.println("Ingrese el nombre del estudiante");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el apellido del estudiante ");
            String apellido = sc.nextLine();

            System.out.println("Ingrese la calificacion 1");
            double cal1 = sc.nextDouble();

            System.out.println("Ingrese la calificacion 2");
            double cal2 = sc.nextDouble();

            System.out.println("Ingrese la calificacion 3");
            double cal3 = sc.nextDouble();

            Estudiantes t = new Estudiantes(nombre, apellido, cal1, cal2, cal3);
            t.calcularPromedio();
            e.insertarEstudiantes(t);

            System.out.println("***Ingrese  1 Salir del programa o "
                    + "Ingrese otro numero para seguir en el programa***");
            opcion = sc.nextInt();
            System.out.println("--------------------------------------------");
            if (opcion == 1) {
                bandera = false;
            }
            sc.nextLine();

        }*/

        for (int i = 0; i < e.obtenerDataEstudiantes().size(); i++) {
            System.out.printf("%s", e.obtenerDataEstudiantes().get(i));
        }

    }

}
