package form;

import config.Koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ArsipView extends javax.swing.JFrame {   
private final Connection conn;
    
    public ArsipView() {
        initComponents();
        conn =Koneksi.getConnection();
        getData();
        
    }
    
    private void getData() {
        DefaultTableModel model = (DefaultTableModel) tblArsip.getModel();
        model.setRowCount(0); // Mengosongkan tabel sebelum menambahkan data baru
        
        try {
            String sql = "SELECT * FROM table_arsip";
            PreparedStatement ps = conn.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery();
                
            while (rs.next()) {
                int kd_arsip = rs.getInt("kd_arsip"); // Mengambil nilai dari kolom kd_arsip
                String arsip = rs.getString("arsip"); // Mengambil nilai dari kolom arsip
                    
                Object[] rowData = {kd_arsip, arsip}; // Membuat array objek untuk baris data
                model.addRow(rowData); // Menambahkan baris data ke dalam tabel
                
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            Logger.getLogger(ArsipView.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKdArsip = new javax.swing.JTextField();
        txtArsip = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblArsip = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Arsip");

        jLabel2.setText("Arsip");

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblArsip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "kode_arsip", "arsip"
            }
        ));
        tblArsip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArsipMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblArsip);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtKdArsip)
                                .addComponent(txtArsip, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKdArsip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtArsip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String kd_arsip = txtKdArsip.getText();
        String arsip = txtArsip.getText();
        
        if(kd_arsip.isEmpty() || arsip.isEmpty()) {
            JOptionPane.showMessageDialog(this, "semua kolum haris di sisi", "validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "insert into table_arsip (kd_arsip,arsip) VALUES (?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, kd_arsip);
                st.setString(2, arsip);
                
                int rowInserted = st.executeUpdate();
                if(rowInserted >0) {
                    JOptionPane.showMessageDialog(this, "data berhasil ditambahkan");
                    resetForm();
                    getData();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ArsipView.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        int selectedRow = tblArsip.getSelectedRow();
        if(selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "pilih baris yang akan dipergarui");
        return;
        }
        
        String kd_arsip =tblArsip.getValueAt(selectedRow, 0).toString();
        String arsip = txtArsip.getText();
        
        if(arsip.isEmpty()) {
        JOptionPane.showMessageDialog(this, "semua kolom harus diisi", "validasi", JOptionPane.ERROR_MESSAGE);
        return;
            }
        
        try {
        String sql = "UPDATE table_arsip SET arsip=? WHERE kd_arsip=?";
        PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, arsip);
            st.setString(2, kd_arsip);
            
            int rowUpdate = st.executeUpdate();
            if(rowUpdate > 0) {
                JOptionPane.showMessageDialog(this, "data berhasil diubah");
                resetForm();
                getData();
            }
            
            st.close();
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(ArsipView.class.getName()).log(Level.SEVERE, null, e);
        }     
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tblArsipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArsipMouseClicked
        int selectRow = tblArsip.getSelectedRow();
        if(selectRow != -1) {
        int selectedRow = 0;
        String kd_arsip = tblArsip.getValueAt(selectedRow, 0).toString();
        String arsip = tblArsip.getValueAt(selectedRow, 1).toString();
        
        txtKdArsip.setText(kd_arsip);
        txtArsip.setText(arsip);
        }
    }//GEN-LAST:event_tblArsipMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int selectedRow = tblArsip.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "");
            return;
        }
        int confirm =JOptionPane.showConfirmDialog(this, "apakah anda yakin ingin menghapus data ini?","Konfirmasi",JOptionPane.YES_OPTION);
        if(confirm== JOptionPane.YES_OPTION) {
            String kd_arsip = tblArsip.getValueAt(selectedRow, 0).toString();
            
            try {
               String sql = "DELETE FROM table_arsip WHERE kd_arsip=?";
               PreparedStatement st = conn.prepareStatement(sql);  
               st.setString(1, kd_arsip);
               
               int rowDelete = st.executeUpdate();
               if(rowDelete > 0) {
                   JOptionPane.showMessageDialog(this, "data Berhasil dihapus");
                   resetForm();
                   getData();
               }
               st.close();
            } catch (Exception e) {
            Logger.getLogger(ArsipView.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

   
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArsipView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ArsipView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblArsip;
    private javax.swing.JTextField txtArsip;
    private javax.swing.JTextField txtKdArsip;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txtKdArsip.setText("");
        txtArsip.setText("");
    }



}
