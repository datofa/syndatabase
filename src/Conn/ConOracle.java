/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    private static String SID = "xe";   
    private static String database = "SIMPEG";   
    private static String url = jdbc + host + port + SID;  
    private static String username = "coba";   
    private static String password = "coba"; 
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
    
    public ResultSet GetData(){
        String sql = "create table ikan(nama varchar2(20));";
        try{
            Statement stat = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return stat.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
