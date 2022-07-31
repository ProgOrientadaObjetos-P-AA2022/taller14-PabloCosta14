/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enlace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import problema02.Estudiantes;

/**
 *
 * @author DELL
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarEstudiantes(Estudiantes estudiantes) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + " cal1, cal2, cal3, promedio) "
                    + "values ('%s', '%s', '%.2f', '%.2f','%.2f', '%.2f')",
                    estudiantes.obtenerNombre(),
                    estudiantes.obtenerApellido(),
                    estudiantes.obtenerCal1(),
                    estudiantes.obtenerCal2(),
                    estudiantes.obtenerCal3(),
                    estudiantes.obtenerPromedio());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarEstudiantes");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Estudiantes> obtenerDataEstudiantes() {
        ArrayList<Estudiantes> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Estudiantes miEstudiante = new Estudiantes(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getDouble("calificacion1"),
                        rs.getDouble("calificacion2"),
                        rs.getDouble("calificacion3"));

                miEstudiante.calcularPromedio();
                lista.add(miEstudiante);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarEstudiantes");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
