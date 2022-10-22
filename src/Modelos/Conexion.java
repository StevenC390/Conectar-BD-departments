/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection connection;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/departments",
                            "root", "1234");
            if (connection != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexión fallida" +e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
