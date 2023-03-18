/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_kasir;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class form_user extends javax.swing.JFrame {
Connection con;
DefaultTableModel tm;

public void connect(){
 con=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/kasir_cafe","root","");
    }catch(Exception e){
    System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }
 }
 
 private void refreshTable(){
 tm = new DefaultTableModel(null,
    new Object[] {"Id Pegawai","Nama Pegawai","Email","Password","Handphone","Level" });
    jTable1.setModel(tm);
    tm.getDataVector().removeAllElements();
    try {
        PreparedStatement s = con.prepareStatement("SELECT*FROM pegawai");
        ResultSet r = s.executeQuery();
        while(r.next()){
        Object[] data ={ 
        r.getString(1),
        r.getString(2),
        r.getString(3),
        r.getString(4),
        r.getString(5),
        r.getString(6)
        };
        tm.addRow(data);
        }
 } catch(Exception e) {
 System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
 }
}
    /**
     * Creates new form form_user
     */
    public form_user() {
        initComponents();
        connect();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtidpeg = new javax.swing.JTextField();
        txtnmpeg = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtpas = new javax.swing.JPasswordField();
        txthp = new javax.swing.JTextField();
        cblevel = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORM USER");

        jLabel2.setText("ID Pegawai");

        jLabel3.setText("Nama Pegawai");

        jLabel4.setText("Email");

        jLabel5.setText("Password");

        jLabel6.setText("Handphone");

        jLabel7.setText("Level");

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        cblevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasir", "Admin", "Manager", " " }));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnmpeg)
                            .addComponent(txtemail)
                            .addComponent(txtpas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cblevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidpeg, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addGap(97, 97, 97))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtidpeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnmpeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cblevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(502, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    int ok = JOptionPane.showConfirmDialog(null,"Anda Yakin Ingin Menghapus Data Ini='"+ 
            txtidpeg.getText()+"'",".:: Konfirmasi ::.", JOptionPane.YES_NO_OPTION);
    if (ok==0){
    try {
    PreparedStatement ps = con.prepareStatement("DELETE FROM pegawai WHERE id_peg=?");
    ps.setString(1, txtidpeg.getText());
    ps.executeUpdate();
    JOptionPane.showMessageDialog(this,"Data telah di delete");
    refreshTable();
    txtidpeg.setText("");
    txtnmpeg.setText("");
    txtemail.setText("");
    txtpas.setText("");
    txthp.setText("");
    cblevel.setSelectedItem("");
    } catch(Exception e) {
    System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try {
    PreparedStatement ps = con.prepareStatement("INSERT INTO pegawai VALUES (?,?,?,?,?,?)");
    ps.setString(1, txtidpeg.getText());
    ps.setString(2, txtnmpeg.getText());
    ps.setString(3, txtemail.getText());
    ps.setString(4, txtpas.getText());
    ps.setString(5, txthp.getText());
    ps.setString(6, cblevel.getSelectedItem().toString());
    ps.executeUpdate();
    JOptionPane.showMessageDialog(this,"Data telah tersimpan");
    refreshTable();
    txtidpeg.setText("");
    txtnmpeg.setText("");
    txtemail.setText("");
    txtpas.setText("");
    txthp.setText("");
    cblevel.setSelectedItem("");
             
    } catch(Exception e) {
    System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          try {
    PreparedStatement ps = con.prepareStatement("UPDATE pegawai SET nama_peg=?, email=?, password=?,handphone=?,level=? WHERE id_peg=?");
    ps.setString(1, txtnmpeg.getText());
    ps.setString(2, txtemail.getText());
    ps.setString(3, txtpas.getText());
    ps.setString(4, txthp.getText());
    ps.setString(5, cblevel.getSelectedItem().toString());
    ps.setString(6, txtidpeg.getText());
    ps.executeUpdate();
    JOptionPane.showMessageDialog(this,"Data telah di update");
    refreshTable();
    txtidpeg.setText("");
    txtnmpeg.setText("");
    txtemail.setText("");
    txtpas.setText("");
    txthp.setText("");
    cblevel.setSelectedItem("");
             
    } catch(Exception e) {
    System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
     if (i == -1){
          //tidak ada baris terseleksi
         return;
     }
     
     String idpeg = (String) tm.getValueAt(i, 0);
     txtidpeg.setText(idpeg);
     
     String namapeg = (String) tm.getValueAt(i, 1);
     txtnmpeg.setText(namapeg);
     
     String email = (String) tm.getValueAt(i, 2);
     txtemail.setText(email);
     
     String password = (String) tm.getValueAt(i, 3);
     txtpas.setText(password);
     
     String hp = (String) tm.getValueAt(i, 4);
     txthp.setText(hp);
     
     String lev = (String) tm.getValueAt(i, 5);
     cblevel.setSelectedItem(lev);
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        Admin ad=new Admin();
        ad.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        // TODO add your handling code here:
        if (txtemail.getText().matches("@"))
        {
            JOptionPane.showMessageDialog(this,"tidk ada simbol @, silahkan isi kembali");
        }
    }//GEN-LAST:event_txtemailKeyPressed

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
            java.util.logging.Logger.getLogger(form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cblevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtidpeg;
    private javax.swing.JTextField txtnmpeg;
    private javax.swing.JPasswordField txtpas;
    // End of variables declaration//GEN-END:variables
}
