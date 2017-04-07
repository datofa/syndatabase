/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Conn.ConOracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QIEM
 */
public class ImportToOracle {

    /**
     * @param args the command line arguments
     */
    private Connection con;
    private Statement stat;
    public static void main(String[] args) {
        // TODO code application logic here
        ConOracle con = new ConOracle();
        try {
            con.Connect();
        } catch (SQLException ex) {
            Logger.getLogger(ImportToOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "DECLARE\n" +
                "JUMLAH_DATA INTEGER;\n" +
                "BEGIN\n" +
                "SELECT COUNT(*) INTO JUMLAH_DATA FROM MD_AGAMA;\n" +
                "  DBMS_OUTPUT.put_line (JUMLAH_DATA);\n" +
                "END;";
//        sql = "select count(*) as jumlah from md_agama";
        try {
            boolean data = con.Query(sql);
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
