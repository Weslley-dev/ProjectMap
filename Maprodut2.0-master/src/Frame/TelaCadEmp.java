package Frame;

import com.basededados.Empresas;
import javax.swing.JOptionPane;

public class TelaCadEmp extends javax.swing.JFrame {

    public TelaCadEmp() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CdtEmp = new javax.swing.JScrollPane();
        txtCadEmp = new javax.swing.JTextPane();
        txtSenhaEmp = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtEmailEmp = new javax.swing.JTextField();
        txtFoneEmp = new javax.swing.JTextField();
        txtLoginEmp = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtLogin = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtDadoEmp = new javax.swing.JTextField();
        txtNomeEmp = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        txtCitEmp = new javax.swing.JTextField();
        txtComplemeto = new javax.swing.JTextField();
        jTxtComplemento = new javax.swing.JTextField();
        txtBairroEmp = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        txtNumeroEmp = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        txtEnderecoEmp = new javax.swing.JTextField();
        jTxtEnd = new javax.swing.JTextField();
        jTxtSenha = new javax.swing.JPasswordField();
        btnVoltarTip = new javax.swing.JButton();
        btnFin1 = new javax.swing.JButton();
        txtNumeroEmp1 = new javax.swing.JTextField();
        jTxtTel = new javax.swing.JFormattedTextField();
        jTxtUf = new javax.swing.JComboBox<>();
        jTxtCNPJ = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCadEmp.setEditable(false);
        txtCadEmp.setBackground(new java.awt.Color(255, 229, 77));
        txtCadEmp.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCadEmp.setText("          Cadastro de Empresa ");
        CdtEmp.setViewportView(txtCadEmp);

        jPanel1.add(CdtEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 40));

        txtSenhaEmp.setEditable(false);
        txtSenhaEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtSenhaEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSenhaEmp.setText("Senha:");
        txtSenhaEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtSenhaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaEmpActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenhaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 50, -1));

        txtEnd.setEditable(false);
        txtEnd.setBackground(new java.awt.Color(255, 255, 255));
        txtEnd.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        txtEnd.setText("Endereço:");
        txtEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });
        jPanel1.add(txtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, -1));

        txtEmailEmp.setEditable(false);
        txtEmailEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmailEmp.setText("E-mail:");
        txtEmailEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtEmailEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailEmpActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 50, -1));

        txtFoneEmp.setEditable(false);
        txtFoneEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtFoneEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFoneEmp.setText("Telefone:");
        txtFoneEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtFoneEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneEmpActionPerformed(evt);
            }
        });
        jPanel1.add(txtFoneEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 60, -1));

        txtLoginEmp.setEditable(false);
        txtLoginEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtLoginEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLoginEmp.setText("Login:");
        txtLoginEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtLoginEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginEmpActionPerformed(evt);
            }
        });
        jPanel1.add(txtLoginEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, -1));

        jTxtCidade.setBackground(new java.awt.Color(204, 204, 204));
        jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, -1));

        jTxtEmail.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 360, -1));

        jTxtLogin.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTxtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        txtCNPJ.setEditable(false);
        txtCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        txtCNPJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCNPJ.setText("CNPJ:");
        txtCNPJ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJActionPerformed(evt);
            }
        });
        jPanel1.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, -1));

        txtDadoEmp.setEditable(false);
        txtDadoEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtDadoEmp.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        txtDadoEmp.setText("Dados da Empresa");
        txtDadoEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtDadoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 150, -1));

        txtNomeEmp.setEditable(false);
        txtNomeEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeEmp.setText("Nome:");
        txtNomeEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtNomeEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));

        jTxtNome.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 360, -1));

        txtCitEmp.setEditable(false);
        txtCitEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtCitEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCitEmp.setText("Cidade:");
        txtCitEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtCitEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 50, -1));

        txtComplemeto.setEditable(false);
        txtComplemeto.setBackground(new java.awt.Color(255, 255, 255));
        txtComplemeto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtComplemeto.setText("Complemento:");
        txtComplemeto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtComplemeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, -1));

        jTxtComplemento.setBackground(new java.awt.Color(204, 204, 204));
        jTxtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtComplementoActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 360, -1));

        txtBairroEmp.setEditable(false);
        txtBairroEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtBairroEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBairroEmp.setText("Bairro:");
        txtBairroEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtBairroEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 50, -1));

        jTxtBairro.setBackground(new java.awt.Color(204, 204, 204));
        jTxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBairroActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 170, -1));

        txtNumeroEmp.setEditable(false);
        txtNumeroEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNumeroEmp.setText("UF:");
        txtNumeroEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtNumeroEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEmpActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 30, -1));

        jTxtNumero.setBackground(new java.awt.Color(204, 204, 204));
        jTxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 60, -1));

        txtEnderecoEmp.setEditable(false);
        txtEnderecoEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtEnderecoEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEnderecoEmp.setText("Endereço:");
        txtEnderecoEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtEnderecoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 70, -1));

        jTxtEnd.setBackground(new java.awt.Color(204, 204, 204));
        jTxtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEndActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 360, -1));

        jTxtSenha.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 190, -1));

        btnVoltarTip.setBackground(new java.awt.Color(255, 229, 77));
        btnVoltarTip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltarTip.setText("Voltar");
        btnVoltarTip.setToolTipText("");
        btnVoltarTip.setActionCommand("");
        btnVoltarTip.setBorderPainted(false);
        btnVoltarTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTipActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarTip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        btnFin1.setBackground(new java.awt.Color(255, 229, 77));
        btnFin1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFin1.setText("Finalizar");
        btnFin1.setToolTipText("");
        btnFin1.setActionCommand("");
        btnFin1.setBorderPainted(false);
        btnFin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 100, 40));

        txtNumeroEmp1.setEditable(false);
        txtNumeroEmp1.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroEmp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNumeroEmp1.setText("Nº:");
        txtNumeroEmp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtNumeroEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEmp1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeroEmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 30, -1));

        jTxtTel.setBackground(new java.awt.Color(204, 204, 204));
        try {
            jTxtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTxtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, -1));

        jTxtUf.setBackground(new java.awt.Color(204, 204, 204));
        jTxtUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF", " " }));
        jPanel1.add(jTxtUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 60, -1));

        jTxtCNPJ.setBackground(new java.awt.Color(204, 204, 204));
        try {
            jTxtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##. ###. ###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jTxtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaEmpActionPerformed

    private void txtFoneEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoneEmpActionPerformed

    private void txtLoginEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginEmpActionPerformed

    private void txtEmailEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailEmpActionPerformed

    private void txtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJActionPerformed

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndActionPerformed

    private void jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidadeActionPerformed

    private void jTxtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtComplementoActionPerformed

    private void jTxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBairroActionPerformed

    private void txtNumeroEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEmpActionPerformed

    private void jTxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroActionPerformed

    private void jTxtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEndActionPerformed

    private void btnFin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin1ActionPerformed
        Empresas empresas = new Empresas ();
        /*
        Aqui eu instanciei a classe empresas para trabalhar com
        o objeto empresa, utilizei os métodos de acesso setters e getters novamente.
        
        */
       empresas.setNome(jTxtNome.getText());
       empresas.setEmail(jTxtEmail.getText());
       empresas.setCnpj(jTxtCNPJ.getText());
       empresas.setTelefone(jTxtTel.getText());
       empresas.setLogin(jTxtLogin.getText());
       empresas.setSenha(jTxtSenha.getText());
       empresas.setEnd(jTxtEnd.getText());
       empresas.setBairro(jTxtBairro.getText());
       empresas.setNumero(jTxtNumero.getText());
       empresas.setUf((String) jTxtUf.getSelectedItem());
       empresas.setComplemento(jTxtComplemento.getText());
       empresas.setCidade(jTxtCidade.getText());
       
       /* Aqui criei um JOptionPane para ter a caixa de diálogo 
       quando for salvar os dados. */ 
       
       JOptionPane.showMessageDialog(jTxtSenha, empresas.salvar());
       
       
       /* aqui utilizei o acesso ao arquivo texto para limpar os dados após 
       o cadastro ser concluído. Novamente utilizando os métodos especiais.
       
       */
       
       jTxtNome.setText("");
       jTxtEmail.setText("");
       jTxtCNPJ.setText("");
       jTxtLogin.setText("");
       jTxtSenha.setText("");
       jTxtEnd.setText("");
       jTxtBairro.setText("");
       jTxtUf.setSelectedItem("");
       jTxtCidade.setText("");
       jTxtComplemento.setText("");
       jTxtTel.setText("");
       
       
    }//GEN-LAST:event_btnFin1ActionPerformed

    private void btnVoltarTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTipActionPerformed
        // TODO add your handling code here:
        TelaTipCad objeto5 = new TelaTipCad();
        objeto5.setVisible(true);
    }//GEN-LAST:event_btnVoltarTipActionPerformed

    private void txtNumeroEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEmp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEmp1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CdtEmp;
    private javax.swing.JButton btnFin1;
    private javax.swing.JButton btnVoltarTip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JFormattedTextField jTxtCNPJ;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEnd;
    private javax.swing.JTextField jTxtLogin;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JPasswordField jTxtSenha;
    private javax.swing.JFormattedTextField jTxtTel;
    private javax.swing.JComboBox<String> jTxtUf;
    private javax.swing.JTextField txtBairroEmp;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextPane txtCadEmp;
    private javax.swing.JTextField txtCitEmp;
    private javax.swing.JTextField txtComplemeto;
    private javax.swing.JTextField txtDadoEmp;
    private javax.swing.JTextField txtEmailEmp;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtEnderecoEmp;
    private javax.swing.JTextField txtFoneEmp;
    private javax.swing.JTextField txtLoginEmp;
    private javax.swing.JTextField txtNomeEmp;
    private javax.swing.JTextField txtNumeroEmp;
    private javax.swing.JTextField txtNumeroEmp1;
    private javax.swing.JTextField txtSenhaEmp;
    // End of variables declaration//GEN-END:variables
}
