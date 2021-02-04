package Frame;

import com.basededados.Clientes;
import javax.swing.JOptionPane;

public class TelaCadUsu1 extends javax.swing.JFrame {

    public TelaCadUsu1() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CdtUsu = new javax.swing.JScrollPane();
        txtCdtUsu = new javax.swing.JTextPane();
        txtSenhaUsu = new javax.swing.JTextField();
        txtNomeUsu = new javax.swing.JTextField();
        txtEmailUsu = new javax.swing.JTextField();
        txtCPFUsu = new javax.swing.JTextField();
        txtLoginUsu = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtLogin = new javax.swing.JTextField();
        jTxtSenha = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();
        btnFim2 = new javax.swing.JButton();
        jTxtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCdtUsu.setEditable(false);
        txtCdtUsu.setBackground(new java.awt.Color(255, 229, 77));
        txtCdtUsu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCdtUsu.setText("          Cadastro de úsuario ");
        CdtUsu.setViewportView(txtCdtUsu);

        jPanel1.add(CdtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 40));

        txtSenhaUsu.setEditable(false);
        txtSenhaUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtSenhaUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSenhaUsu.setText("Senha:");
        txtSenhaUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtSenhaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenhaUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 50, -1));

        txtNomeUsu.setEditable(false);
        txtNomeUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeUsu.setText("Nome:");
        txtNomeUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtNomeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));

        txtEmailUsu.setEditable(false);
        txtEmailUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmailUsu.setText("E-mail:");
        txtEmailUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtEmailUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 50, -1));

        txtCPFUsu.setEditable(false);
        txtCPFUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtCPFUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCPFUsu.setText("CPF:");
        txtCPFUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtCPFUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPFUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, -1));

        txtLoginUsu.setEditable(false);
        txtLoginUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtLoginUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLoginUsu.setText("Login:");
        txtLoginUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtLoginUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuActionPerformed(evt);
            }
        });
        jPanel1.add(txtLoginUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, -1));

        jTxtNome.setBackground(new java.awt.Color(204, 204, 204));
        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 360, -1));

        jTxtEmail.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 360, -1));

        jTxtLogin.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTxtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, -1));

        jTxtSenha.setBackground(new java.awt.Color(204, 204, 204));
        jTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 190, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 229, 77));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("");
        btnVoltar.setActionCommand("");
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        btnFim2.setBackground(new java.awt.Color(255, 229, 77));
        btnFim2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFim2.setText("Finalizar");
        btnFim2.setToolTipText("");
        btnFim2.setActionCommand("");
        btnFim2.setBorderPainted(false);
        btnFim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFim2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 100, 40));

        jTxtCPF.setBackground(new java.awt.Color(204, 204, 204));
        try {
            jTxtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTxtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuActionPerformed

    private void txtCPFUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFUsuActionPerformed

    private void txtLoginUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUsuActionPerformed

    private void btnFim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFim2ActionPerformed
       Clientes cadastros = new Clientes ();
        /*
        Do mesmo jeito da classe empresas, aqui eu instanciei a classe clientes para trabalhar com
        o objeto empresa, utilizei os métodos de acesso setters e getters novamente.
        
        */
        
       cadastros.setNome(jTxtNome.getText());
       cadastros.setEmail(jTxtEmail.getText());
       cadastros.setCpf(jTxtCPF.getText());
       cadastros.setLogin(jTxtLogin.getText());
       cadastros.setSenha(jTxtSenha.getText());
       
       /* Aqui criei um JOptionPane para ter a caixa de diálogo 
       quando for salvar os dados. */ 
       
       JOptionPane.showMessageDialog(null, cadastros.salvar());
       
       /* aqui utilizei o acesso ao arquivo texto para limpar os dados após 
       o cadastro ser concluído. Novamente utilizando os métodos especiais.
       
       */
       jTxtNome.setText("");
       jTxtEmail.setText("");
       jTxtCPF.setText("");
       jTxtLogin.setText("");
       jTxtSenha.setText("");
       
       
       
    }//GEN-LAST:event_btnFim2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        TelaTipCad objeto5 = new TelaTipCad();
        objeto5.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadUsu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CdtUsu;
    private javax.swing.JButton btnFim2;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jTxtCPF;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtLogin;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JTextField txtCPFUsu;
    private javax.swing.JTextPane txtCdtUsu;
    private javax.swing.JTextField txtEmailUsu;
    private javax.swing.JTextField txtLoginUsu;
    private javax.swing.JTextField txtNomeUsu;
    private javax.swing.JTextField txtSenhaUsu;
    // End of variables declaration//GEN-END:variables
}
