/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author DELL
 */
public class Estudiantes {

    private String nombre;
    private String apellido;

    private double cal1;
    private double cal2;
    private double cal3;

    private double promedio;

    public Estudiantes(String n, String a, double n1, double n2, double n3) {
        nombre = n;
        apellido = a;
        cal1 = n1;
        cal2 = n2;
        cal3 = n3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public void establecerCal1(double n) {
        cal1 = n;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public void establecerCal2(double n) {
        cal2 = n;
    }

    public double obtenerCal3() {
        return cal3;
    }

    public void establecerCal3(double n) {
        cal3 = n;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        promedio = (cal1 + cal2 + cal3) / 3;
    }

    @Override
    public String toString() {
        String data = String.format(""
                + "%s %s\n"
                + " Calificaciones:\n"
                + " %.1f\n"
                + " %.1f\n"
                + " %.1f\n"
                + " Promedio: %.2f\n\n",
                nombre,
                apellido,
                cal1,
                cal2,
                cal3,
                promedio);
        return data;

    }
}
