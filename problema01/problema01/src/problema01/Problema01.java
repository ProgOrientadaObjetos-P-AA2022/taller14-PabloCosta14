/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Enlace;

/**
 *
 * @author DELL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean bandera = true;

        int opcion;
        Enlace e = new Enlace();
        while (bandera) {
            System.out.println("*****Ingrese Datos de trabajdor*******");

            System.out.println("Ingrese su numero de cedula");
            String cedula = sc.nextLine();

            System.out.println("Ingrese sus nombres");
            String nombre = sc.nextLine();

            System.out.println("Ingrese su correo");
            String correo = sc.nextLine();

            System.out.println("Ingrese su sueldo");
            double sueldo = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese el mes del sueldo");
            String mes = sc.nextLine();

            Trabajadores t = new Trabajadores(cedula, nombre, correo, sueldo, mes);

            e.insertarTrabajador(t);

            System.out.println("***Ingrese  1 Salir del programa o "
                    + "Ingrese otro numero para seguir en el programa***");
            opcion = sc.nextInt();
            System.out.println("--------------------------------------------");
            if (opcion == 1) {
                bandera = false;
            }
            sc.nextLine();

        }

        for (int i = 0; i < e.obtenerDataTrabajadores().size(); i++) {
            System.out.printf("----------------\n%s", e.obtenerDataTrabajadores().get(i));
        }

    }
}
