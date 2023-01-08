/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finda.view;
import javax.swing.JComboBox;
import FindaController.PeminjamanController;
/**
 *
 * @author Mutiara Maharani
 */
public class FormPeminjaman extends javax.swing.JFrame  {

    /**
     * Creates new form FormPeminjaman
     */
    
    PeminjamanController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.bersihForm();
        controller.tampilData();
        controller.setCboBuku();
        controller.setCboNobp();
    }

    public JComboBox<String> getCboBuku() {
        return cboBuku;
    }

    public JComboBox<String> getCboNobp() {
        return cboNobp;
    }
    
    public javax.swing.JTextField getTxtTglpinjam(){
       return txtTglpinjam;
    }
    public javax.swing.JTextField getTxtTglkembali(){
        return txtTglkembali;
    }
    public javax.swing.JTable getTblPeminjaman(){
        return tblPeminjaman;
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
        txtTglkembali = new javax.swing.JTextField();
        txtTglpinjam = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        cboBuku = new javax.swing.JComboBox<>();
        cboNobp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Peminjaman");
        getContentPane().setLayout(null);

        jLabel1.setText("No Bp");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 90, 30);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 90, 30);

        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 90, 30);

        jLabel4.setText("Tanggal Kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 110, 30);
        getContentPane().add(txtTglkembali);
        txtTglkembali.setBounds(120, 100, 300, 30);
        getContentPane().add(txtTglpinjam);
        txtTglpinjam.setBounds(120, 70, 300, 30);

        btnExit.setText("Exit");
        getContentPane().add(btnExit);
        btnExit.setBounds(370, 140, 60, 23);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 140, 70, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(100, 140, 80, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(190, 140, 80, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(280, 140, 80, 23);

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Bp", "Kode Buku", "Tanggal Pinjam", "Tanggal Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 410, 250);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboBuku);
        cboBuku.setBounds(120, 40, 300, 30);

        cboNobp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNobp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNobpActionPerformed(evt);
            }
        });
        getContentPane().add(cboNobp);
        cboNobp.setBounds(120, 10, 300, 30);

        setSize(new java.awt.Dimension(458, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
         controller.bersihForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.savePeminjaman();
        controller.tampilData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        // TODO add your handling code here:
         controller.getPeminjaman();
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updatePeminjaman();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deletePeminjaman();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cboNobpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNobpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNobpActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JComboBox<String> cboNobp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtTglkembali;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}
