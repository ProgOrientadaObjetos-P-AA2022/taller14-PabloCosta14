/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author DELL
 */
public class Trabajadores {

    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mes;

    public Trabajadores(String a, String b, String c, double d, String h) {
        cedula = a;
        nombres = b;
        correo = c;
        sueldo = d;
        mes = h;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public void establecerCorreo(String n) {
        correo = n;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public String obtenerMes() {
        return mes;
    }

    public void establecerMes(String n) {
        mes = n;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes   : %s\n",
                nombres,
                cedula,
                correo,
                sueldo,
                mes);
        return cadena;
    }

}
