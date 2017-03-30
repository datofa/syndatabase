/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author QIEM
 */
public class ConSqlite {
    private Connection koneksi;
    public void ConSqlite() {

    }

    public Connection Connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            JOptionPane.showMessageDialog(null, "berhasil load driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Tidak ada Driver!\n" + ex);
        }
        try {
//            String url = "jdbc:sqlite:G:/datofa_project/project/syndata/src/db/koneksi.db";
//            String dir =  System.getProperty("user.dir");
            String url = "jdbc:sqlite:C:/koneksi.db";
            koneksi = DriverManager.getConnection(url);
            System.out.println("Berhasil koneksi");
        } catch (SQLException se) {
            System.out.println("Gagal koneksi " + se);
            JOptionPane.showMessageDialog(null, "Gagal Koneksi Database", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        return koneksi;
    }
}
