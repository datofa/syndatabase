/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Conn.ConSqlite;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QIEM
 */
public class FormTabelUtama extends javax.swing.JFrame {
    private DefaultTableModel DftTabMode1;
    private java.sql.Connection koneksi = new ConSqlite().Connect();
    /**
     * Creates new form FormTabelUtama
     */
    public FormTabelUtama() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuery = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        QueryInsert = new javax.swing.JTextArea();
        QueryName = new javax.swing.JTextField();
        QueryNumb = new javax.swing.JTextField();
        btnSaveQuery = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        QueryKode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        QueryTabel2 = new javax.swing.JTextField();
        QueryTabel1 = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnAtas = new javax.swing.JButton();
        btnBawah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableQuery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableQueryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableQuery);

        QueryInsert.setColumns(20);
        QueryInsert.setRows(5);
        jScrollPane2.setViewportView(QueryInsert);

        QueryNumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryNumbActionPerformed(evt);
            }
        });

        btnSaveQuery.setText("Simpan");
        btnSaveQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveQueryActionPerformed(evt);
            }
        });

        jLabel1.setText("No");

        jLabel2.setText("Nama");

        jLabel3.setText("Query Insert");

        jLabel5.setText("Kode");

        jLabel6.setText("Tabel Tujuan");

        jLabel7.setText("Tabel Sumber");

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnAtas.setText("Atas");
        btnAtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtasActionPerformed(evt);
            }
        });

        btnBawah.setText("Bawah");
        btnBawah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBawahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveQuery)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(QueryKode, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(QueryNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(QueryName)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(QueryTabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(QueryTabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAtas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBawah, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QueryKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QueryTabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QueryTabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtas)
                                .addGap(2, 2, 2)
                                .addComponent(btnBawah)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveQuery)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnReset)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QueryNumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryNumbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QueryNumbActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        ubah();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        hapus();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSaveQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveQueryActionPerformed
        // TODO add your handling code here:
        simpan();
    }//GEN-LAST:event_btnSaveQueryActionPerformed

    private void tableQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableQueryMouseClicked
        // TODO add your handling code here:
        detail();
    }//GEN-LAST:event_tableQueryMouseClicked

    private void btnAtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtasActionPerformed
        // TODO add your handling code here:
        upData();
    }//GEN-LAST:event_btnAtasActionPerformed

    private void btnBawahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBawahActionPerformed
        // TODO add your handling code here:
        downData();
    }//GEN-LAST:event_btnBawahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTabelUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTabelUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTabelUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTabelUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTabelUtama().setVisible(true);
            }
        });
    }
    
    public void detail(){
        int baris = tableQuery.getSelectedRow();
        String kode = DftTabMode1.getValueAt(baris, 0).toString();     
        String sql="Select * from QueryList where kode='" 
                + kode +"'";
        System.out.println(sql);
            java.sql.Statement stmt = null;
        try {
            stmt = koneksi.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FormTabelUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            java.sql.ResultSet rslt=stmt.executeQuery(sql);
            while(rslt.next()){
               
                String no = rslt.getString("no");
                String nama = rslt.getString("nama");
                String tabel1 = rslt.getString("tabel1");
                String tabel2 = rslt.getString("tabel2");
                String qinsert = rslt.getString("qinsert");
                String qupdate = rslt.getString("qupdate");
                QueryKode.setText(kode);
                QueryNumb.setText(no);
                QueryName.setText(nama);
                QueryTabel1.setText(tabel1);
                QueryTabel2.setText(tabel2);
                QueryInsert.setText(qinsert);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormTabelUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reset(){
        QueryKode.setText(null);
        QueryNumb.setText(null);
        QueryName.setText(null);
        QueryTabel1.setText(null);
        QueryTabel2.setText(null);
        QueryInsert.setText(null);
        QueryNumb.requestFocus();
    }
    
    public void simpan(){
        if (QueryNumb.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nomor masih kosong!\n"
                    + "Silahkan diisi terlebih dahulu!");
            QueryNumb.requestFocus();
        }else if (QueryName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama masih kosong!\n"
                    + "Silahkan diisi terlebih dahulu!");
            QueryName.requestFocus();
        }else if (QueryInsert.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Query Insert  masih kosong!\n"
                    + "Silahkan diisi terlebih dahulu!");
            QueryInsert.requestFocus();
        }
//        else if (QueryUpdate.getText().equals("")){
//            JOptionPane.showMessageDialog(null, "Query Update masih kosong!\n"
//                    + "Silahkan diisi terlebih dahulu!");
//            QueryUpdate.requestFocus();
//        }
        else {
            try{
            String sql = "insert into QueryList(no, nama, qinsert)"
            + " values(?,?,?)";
            java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
            
            try{
                stmt.setString(1, QueryNumb.getText());
                stmt.setString(2, QueryName.getText());
                stmt.setString(3, QueryInsert.getText());
//                stmt.setString(4, QueryUpdate.getText());

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
                //bersihkan teks
                reset();
                loadTable();
            }catch(SQLException se){
                //System.out.println("Gagal di simpan");
                JOptionPane.showMessageDialog(null,"Data Gagal disimpan!"
                    + "\nDengan Pesan : " + se.getMessage());
            }
            stmt.close();
        }catch(Exception e){}
        }
    }
    
    public void ubah(){

        String sql= "update mahasiswa set no = ?, nama = ?, tabel1 = ?, tabel2 = ?, qinsert = ? where kode = '" 
                + QueryKode.getText()+"'";
        System.out.println(sql);
        java.sql.PreparedStatement stmt = null;
        try {
            stmt = koneksi.prepareStatement(sql);
        } catch (SQLException ex) {}

        try{
            stmt.setString(1, QueryNumb.getText());
            stmt.setString(2, QueryName.getText());
            stmt.setString(3, QueryTabel1.getText());
            stmt.setString(4, QueryTabel2.getText());
            stmt.setString(5, QueryInsert.getText());
//            stmt.setString(6, QueryUpdate.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah!");
            reset();
            loadTable();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Data gagal diubah!"
                + "\nTerjadi error dengan pesan : " + se.getMessage());
        }
    }
    
    public void hapus(){
        int ok=JOptionPane.showConfirmDialog(null,
                "Apakah Anda yakin?","Konfirmasi",JOptionPane.YES_NO_OPTION);

        if(ok==0){
            try{
                //panggil method koneksi
                String sql="delete from QueryList where kode = '" 
                        + QueryKode.getText()+"'";
                java.sql.PreparedStatement stmt=koneksi.prepareStatement(sql);
                stmt.executeUpdate();
                //bersihkan teks
                JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
                reset();
                loadTable();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal dihapus!"
                    + "\nDengan pesan error : " + e.getMessage());
            }
        }
    }
    
    public void loadTable(){
        Object[] Baris = {"Kode", "No", "Nama"};
//                , "Tabel1", "Tabel2", "Insert", "Update"};
        DftTabMode1 = new DefaultTableModel(null, Baris);
        tableQuery.setModel(DftTabMode1);
 
        try{
            String sql="Select * from QueryList order by no asc";
            java.sql.Statement stmt=koneksi.createStatement();
            java.sql.ResultSet rslt=stmt.executeQuery(sql);
            while(rslt.next()){
                String kode = rslt.getString("kode");
                String no = rslt.getString("no");
                String nama = rslt.getString("nama");
                String tabel1 = rslt.getString("tabel1");
                String tabel2 = rslt.getString("tabel2");
                String qinsert = rslt.getString("qinsert");
                String qupdate = rslt.getString("qupdate");
                String[] dataField={kode, no, nama};
//                , tabel1, tabel2, qinsert, qupdate};
                DftTabMode1.addRow(dataField);
            }
        }catch(Exception ex){}
    }
    
    public void upData(){
        int no_temp = 1000000;
        int no1 = 0;
        no1 = Integer.parseInt(QueryNumb.getText());
        if (no1>1){
            int no2 = no1-1;
            String numb1 =  Integer.toString(no1);
            String numb2 =   Integer.toString(no2);
            String numbtemp =  Integer.toString(no_temp);
            String sqlUpdate1= "update mahasiswa set no = ? where no = '" 
                    + no1+"'";
//            String sqlUpdate2= "update mahasiswa set no = ? where no = '" 
//                    + no2+"'";
//            String sqlUpdate3= "update mahasiswa set no = ? where no = '" 
//                    + no_temp+"'";
            
            System.out.println(sqlUpdate1);
//                        System.out.println(sqlUpdate2);
//                                    System.out.println(sqlUpdate3);
            java.sql.PreparedStatement stmt = null;
//            java.sql.PreparedStatement stmt2 = null;
//            java.sql.PreparedStatement stmt3 = null;
            try {
                stmt = koneksi.prepareStatement(sqlUpdate1);
//                stmt2 = koneksi.prepareStatement(sqlUpdate2);
//                stmt3 = koneksi.prepareStatement(sqlUpdate3);
            } catch (SQLException ex) {
            }

            try{
//                stmt2.setString(1, no_temp);
//                stmt2.executeUpdate();
                stmt.setString(1, numbtemp);
                stmt.executeUpdate();
//                stmt3.setString(1, no1);
//                stmt3.executeUpdate();
    //            JOptionPane.showMessageDialog(null,"Data Berhasil diubah!");
    //            reset();
                loadTable();
            }catch(SQLException se){
                JOptionPane.showMessageDialog(null,"Data gagal diubah!"
                    + "\nTerjadi error dengan pesan : " + se.getMessage());
            }
        }
    }
    
    public void downData(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea QueryInsert;
    private javax.swing.JTextField QueryKode;
    private javax.swing.JTextField QueryName;
    private javax.swing.JTextField QueryNumb;
    private javax.swing.JTextField QueryTabel1;
    private javax.swing.JTextField QueryTabel2;
    private javax.swing.JButton btnAtas;
    private javax.swing.JButton btnBawah;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveQuery;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableQuery;
    // End of variables declaration//GEN-END:variables
}
