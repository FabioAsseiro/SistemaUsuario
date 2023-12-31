package sistemausuario;

import javax.swing.JOptionPane;
import sistemausuario.DAO;
import sistemausuario.TelaInicio;
import sistemausuario.Usuario;
import sistemausuario.UsuarioLogado;

@SuppressWarnings("Cadastro")


public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        super("A3");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotaoEntrar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextLogin = new javax.swing.JTextPane();
        Login = new javax.swing.JLabel();
        TextSenha = new javax.swing.JPasswordField();
        X = new javax.swing.JButton();
        Senha = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoEntrar.setText("Entrar");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        TextLogin.setBackground(new java.awt.Color(26, 29, 94));
        TextLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        TextLogin.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TextLogin.setSelectedTextColor(new java.awt.Color(225, 225, 225));
        TextLogin.setSelectionColor(new java.awt.Color(225, 225, 225));
        jScrollPane1.setViewportView(TextLogin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 210, -1));

        Login.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20));

        TextSenha.setBackground(new java.awt.Color(26, 29, 94));
        TextSenha.setForeground(new java.awt.Color(255, 255, 255));
        TextSenha.setToolTipText("");
        TextSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, -1));

        X.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        X.setText("X");
        X.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        jPanel1.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 30, 30));

        Senha.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha");
        jPanel1.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 130, -1, 20));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\OneDrive\\Documentos\\NetBeansProjects\\SistemaUsuario\\src\\sistemausuario\\Azul.jpg")); // NOI18N
        jPanel1.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(427, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        // TODO add your handling code here:
        Cadastro TelaDeCadastro = new Cadastro();
        TelaDeCadastro.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
   // Pega o login do usuário
    String login = TextLogin.getText();
    // Pega a senha do usuário
    String senha = new String(TextSenha.getPassword());

    try {
        // Verifica se o usuário é válido
        Usuario usuario = new Usuario(login, senha);
        DAO dao = new DAO();

        if (dao.existe(usuario)) {
            JOptionPane.showMessageDialog(null, "Bem vindo, " + usuario.getNome() + "!");

            // Define o nome e o ID do usuário logado
            UsuarioLogado.setNome(usuario.getNome());
            UsuarioLogado.setId(usuario.getId());

            TelaInicio TelaInicio = new TelaInicio();
            TelaInicio.setVisible(true);

            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário inválido.");
        }
    } catch (Exception e) {
        // Lidar com exceções, se ocorrerem
        JOptionPane.showMessageDialog(null, "Problemas técnicos");
    }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_XActionPerformed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Senha;
    private javax.swing.JTextPane TextLogin;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JButton X;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
