/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.view;

import javax.swing.JOptionPane;

/**
 *
 * @author hahn
 */
public class FrmCuaca extends javax.swing.JFrame {

    /**
     * Creates new form FrmCuaca
     */
    public FrmCuaca() {
        initComponents();
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
        txtKota = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cbWaktu = new javax.swing.JComboBox<>();
        lblCuaca = new javax.swing.JLabel();
        lblCuaca2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSuhu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSuhuMax = new javax.swing.JLabel();
        lblSuhuMin = new javax.swing.JLabel();
        lblAngin = new javax.swing.JLabel();
        lblLembab = new javax.swing.JLabel();
        lblUdara = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jLabel1.setText("Kota");

        txtKota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbWaktu.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        cbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hari Ini", "Kemarin", "Besok" }));
        cbWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbWaktuActionPerformed(evt);
            }
        });

        lblCuaca.setFont(new java.awt.Font("Arial Unicode MS", 0, 22)); // NOI18N
        lblCuaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuaca.setText("Monitor Cuaca");

        lblCuaca2.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        lblCuaca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuaca2.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("Suhu maksimum");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setText("Suhu minimum");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel4.setText("Kecepatan Angin");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel5.setText("Kelembaban");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel6.setText("Tekanan Udara");

        lblSuhu.setFont(new java.awt.Font("Arial Unicode MS", 0, 36)); // NOI18N
        lblSuhu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuhu.setText("00.0 *C");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piiiutscuaca/res/04n.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSuhu)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblSuhu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblSuhuMax.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        lblSuhuMax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSuhuMax.setText("00.0 *C");
        lblSuhuMax.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblSuhuMin.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        lblSuhuMin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSuhuMin.setText("00.0 *C");
        lblSuhuMin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblAngin.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        lblAngin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAngin.setText("000.0 m/h");
        lblAngin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblLembab.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        lblLembab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLembab.setText("00.0 %");
        lblLembab.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblUdara.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        lblUdara.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUdara.setText("000.0 hPa");
        lblUdara.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblLembab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAngin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblUdara)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSuhuMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSuhuMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCuaca2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCuaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCuaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCuaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuhuMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblSuhuMin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblAngin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblLembab, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUdara, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jMenuItem1.setMnemonic('X');
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('H');
        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jMenuItem2.setMnemonic('E');
        jMenuItem2.setText("Tentang");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jMenuItem3.setMnemonic('B');
        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new DlgHelp().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Aplikasi Monitor Cuaca"+"\nIman Muliawan"+"\nNPM 1641808");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cbWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbWaktuActionPerformed
        // TODO add your handling code here:
        if(txtKota.getText().equals("")) {
            lblCuaca.setText("Monitor Cuaca");
            lblCuaca2.setText((String)cbWaktu.getSelectedItem());
        } else {
            lblCuaca.setText("Cuaca di " + txtKota.getText());
            lblCuaca2.setText((String)cbWaktu.getSelectedItem());
        }

        if(txtKota.getText().equals("") && cbWaktu.getSelectedItem().equals("Hari Ini")) {
            lblSuhu.setText("00.0 *C");
            lblSuhuMax.setText("00.0 *C");
            lblSuhuMin.setText("00.0 *C");
            lblAngin.setText("000.0 m/h");
            lblLembab.setText("00.0 %");
            lblUdara.setText("000.0 hPa");
        } else {
            if(txtKota.getText().equals("") && cbWaktu.getSelectedItem().equals("Kemarin")) {
                lblSuhu.setText("00.0 *C");
                lblSuhuMax.setText("00.0 *C");
                lblSuhuMin.setText("00.0 *C");
                lblAngin.setText("000.0 m/h");
                lblLembab.setText("00.0 %");
                lblUdara.setText("000.0 hPa");
            } else {
                if(txtKota.getText().equals("Bandung") && cbWaktu.getSelectedItem().equals("Besok")) {
                    lblSuhu.setText("00.0 *C");
                    lblSuhuMax.setText("00.0 *C");
                    lblSuhuMin.setText("00.0 *C");
                    lblAngin.setText("000.0 m/h");
                    lblLembab.setText("00.0 %");
                    lblUdara.setText("000.0 hPa");
                }
            }
        }
        
        if(txtKota.getText().equals("Bandung") && cbWaktu.getSelectedItem().equals("Hari Ini")) {
            lblSuhu.setText("22.4 *C");
            lblSuhuMax.setText("28.1 *C");
            lblSuhuMin.setText("20.8 *C");
            lblAngin.setText("50 m/h");
            lblLembab.setText("94.8 %");
            lblUdara.setText("198.4 hPa");
        } else {
            if(txtKota.getText().equals("Bandung") && cbWaktu.getSelectedItem().equals("Kemarin")) {
                lblSuhu.setText("24.6 *C");
                lblSuhuMax.setText("32.0 *C");
                lblSuhuMin.setText("20.4 *C");
                lblAngin.setText("101.2 m/h");
                lblLembab.setText("94.8 %");
                lblUdara.setText("198.4 hPa");
            } else {
                if(txtKota.getText().equals("Bandung") && cbWaktu.getSelectedItem().equals("Besok")) {
                    lblSuhu.setText("22.6 *C");
                    lblSuhuMax.setText("29.3 *C");
                    lblSuhuMin.setText("21.8 *C");
                    lblAngin.setText("98.5 m/h");
                    lblLembab.setText("95.8 %");
                    lblUdara.setText("200.1 hPa");
                }
            }
        }
        
        if(txtKota.getText().equals("Jakarta") && cbWaktu.getSelectedItem().equals("Hari Ini")) {
            lblSuhu.setText("30.4 *C");
            lblSuhuMax.setText("33.1 *C");
            lblSuhuMin.setText("28.8 *C");
            lblAngin.setText("88 m/h");
            lblLembab.setText("104.8 %");
            lblUdara.setText("208.2 hPa");
        } else {
            if(txtKota.getText().equals("Jakarta") && cbWaktu.getSelectedItem().equals("Kemarin")) {
                lblSuhu.setText("29.8 *C");
                lblSuhuMax.setText("32.0 *C");
                lblSuhuMin.setText("20.4 *C");
                lblAngin.setText("98.8 m/h");
                lblLembab.setText("94.8 %");
                lblUdara.setText("198.4 hPa");
            } else {
                if(txtKota.getText().equals("Jakarta") && cbWaktu.getSelectedItem().equals("Besok")) {
                    lblSuhu.setText("22.6 *C");
                    lblSuhuMax.setText("29.3 *C");
                    lblSuhuMin.setText("21.8 *C");
                    lblAngin.setText("98.5 m/h");
                    lblLembab.setText("95.8 %");
                    lblUdara.setText("190.1 hPa");
                }
            }
        }
        
        if(txtKota.getText().equals("Surabaya") && cbWaktu.getSelectedItem().equals("Hari Ini")) {
            lblSuhu.setText("27.2 *C");
            lblSuhuMax.setText("28.1 *C");
            lblSuhuMin.setText("20.8 *C");
            lblAngin.setText("110 m/h");
            lblLembab.setText("86.2 %");
            lblUdara.setText("166.2 hPa");
        } else {
            if(txtKota.getText().equals("Surabaya") && cbWaktu.getSelectedItem().equals("Kemarin")) {
                lblSuhu.setText("27.6 *C");
                lblSuhuMax.setText("31.7 *C");
                lblSuhuMin.setText("26.2 *C");
                lblAngin.setText("101.1 m/h");
                lblLembab.setText("96.3 %");
                lblUdara.setText("218.4 hPa");
            } else {
                if(txtKota.getText().equals("Surabaya") && cbWaktu.getSelectedItem().equals("Besok")) {
                    lblSuhu.setText("22.6 *C");
                    lblSuhuMax.setText("29.3 *C");
                    lblSuhuMin.setText("21.8 *C");
                    lblAngin.setText("98.5 m/h");
                    lblLembab.setText("95.8 %");
                    lblUdara.setText("200.1 hPa");
                }
            }
        }
    }//GEN-LAST:event_cbWaktuActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCuaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbWaktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAngin;
    private javax.swing.JLabel lblCuaca;
    private javax.swing.JLabel lblCuaca2;
    private javax.swing.JLabel lblLembab;
    private javax.swing.JLabel lblSuhu;
    private javax.swing.JLabel lblSuhuMax;
    private javax.swing.JLabel lblSuhuMin;
    private javax.swing.JLabel lblUdara;
    private javax.swing.JTextField txtKota;
    // End of variables declaration//GEN-END:variables
}
