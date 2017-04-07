/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conn;

import app.FormTabelUtama;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import java.lang.String;

/**
 *
 * @author QIEM
 */
public class ConOracle {
    
    private static Connection connect;  
    private static String driverName = "oracle.jdbc.driver.OracleDriver";  
    private static String jdbc = "jdbc:oracle:thin:";  
    private static String host = "@localhost:";  
    private static String port = "1521:";  
    private static String SID = "SIMPEG";   
    private static String database = "SIMPEG";   
    private static String url = jdbc + host + port + SID;  
    private static String username = "simpeg";   
    private static String password = "simpeg"; 
    public void ConOracle(){
        
    }
    
    public static Connection Connect()throws SQLException{
            if (connect == null) {  
            try {  
              Class.forName(driverName);  
              System.out.println("Class Driver Ditemukan");  
              try {  
               connect = DriverManager.getConnection(url, username, password);  
               System.out.println("Koneksi Database Sukses");  
              } catch (SQLException se) {  
               System.out.println("Koneksi Database Gagal : " + se);  
               System.exit(0);  
              }  
            } catch (ClassNotFoundException cnfe) {  
              System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);  
              System.exit(0);  
            }  
           }  
           return connect;  
    }
    
    public boolean Query(String sql) throws SQLException{
        boolean data = false;
        Statement stat = connect.prepareCall(sql);
        try{
            stat.execute(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
       
    }
    
//    public void set_host(String host){
//        this.host = host;
//    }
//    
//    public void set_port(String port){
//        this.port = port;
//    }
//    
//    public void set_user(String user){
//       this.username = user; 
//    }
//    
//    public void set_password(String password){
//        this.password = password;
//    }
//    
//    public void set_sid(String sid){
//        this.SID = sid;
//    }
    
 
}

