package Frame;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    /** Creates new form TelaTipCad */
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EscCdt = new javax.swing.JPanel();
        btnAcessar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        Login = new javax.swing.JPanel();
        BarraUsu = new javax.swing.JTextField();
        BarraSenhaLogin = new javax.swing.JPasswordField();
        Cadeado = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EscCdt.setBackground(new java.awt.Color(255, 255, 255));
        EscCdt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcessar.setBackground(new java.awt.Color(255, 229, 77));
        btnAcessar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnAcessar.setText("Acessar");
        btnAcessar.setToolTipText("");
        btnAcessar.setActionCommand("");
        btnAcessar.setBorderPainted(false);
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        EscCdt.add(btnAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 140, 40));

        btnCadastrar.setBackground(new java.awt.Color(255, 229, 77));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("");
        btnCadastrar.setActionCommand("");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        EscCdt.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 140, 40));

        Login.setBackground(new java.awt.Color(255, 229, 77));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Login.add(BarraUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, -1));

        BarraSenhaLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Login.add(BarraSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, -1));
        Login.add(Cadeado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        Login.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuário.png"))); // NOI18N
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Senha.png"))); // NOI18N
        Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        EscCdt.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 280, 120));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/titulo2.png"))); // NOI18N
        EscCdt.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Bem-vindo");
        EscCdt.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo1.jpg"))); // NOI18N
        EscCdt.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        getContentPane().add(EscCdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
    	
        BufferedReader br = null;
        String line;
        
        try{
            br = new BufferedReader(new FileReader("clientes.txt"));
            if((line = br.readLine()) != null){
                JOptionPane.showMessageDialog(null, "Login feito com sucesso!");
                TelaPesquisa objeto1 = new TelaPesquisa();
                objeto1.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Ainda não há cadastro!");
            }
        } catch(IOException e){ 
    } 
           
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        TelaTipCad objeto1 = new TelaTipCad(); //Criei uma instância que gera um objeto
        objeto1.setVisible(true);//Através do objeto solicitei abrir a TelaTipCad
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField BarraSenhaLogin;
    private javax.swing.JTextField BarraUsu;
    private javax.swing.JLabel Cadeado;
    private javax.swing.JPanel EscCdt;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
