/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Conexion;
import Vistas.Departaments;

/**
 *
 * @author Steven
 */
public class Depertamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_conn = new Conexion();
        Departaments inst_frame = new Departaments();
        inst_conn.getConnection();
        inst_frame.setVisible(true);
    }

}
