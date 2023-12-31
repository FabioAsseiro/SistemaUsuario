/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemausuario;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.text.DecimalFormat;


public class AddGasto extends javax.swing.JFrame {

    /**
     * Creates new form AddGasto
     */
    public AddGasto() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        NomeText = new javax.swing.JTextPane();
        Sair = new javax.swing.JButton();
        ValorText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataText = new javax.swing.JTextPane();
        Adicionar = new javax.swing.JButton();
        Tipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TipoTxt = new javax.swing.JTextField();
        VerificarTipos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\OneDrive\\Documentos\\NetBeansProjects\\SistemaUsuario\\build\\classes\\sistemausuario\\Fundo1.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(NomeText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, -1));

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        ValorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTextActionPerformed(evt);
            }
        });
        getContentPane().add(ValorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, -1));

        jScrollPane2.setViewportView(DataText);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, -1));

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        Tipo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Tipo.setForeground(new java.awt.Color(0, 0, 0));
        Tipo.setText("Tipo");
        getContentPane().add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        getContentPane().add(TipoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, -1));

        VerificarTipos.setText("Verificar Tipos");
        VerificarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarTiposActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\OneDrive\\Documentos\\NetBeansProjects\\SistemaUsuario\\build\\classes\\sistemausuario\\Fundo1.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        setSize(new java.awt.Dimension(400, 304));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        TelaInicio TelaInicio = new TelaInicio();
                TelaInicio.setVisible(true);
                
                dispose();
                
    }//GEN-LAST:event_SairActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
                                     
    String nome = NomeText.getText();
    String valorText = ValorText.getText();
    double valor;

    if (valorText.contains(",")) {
        valorText = valorText.replace(",", ".");
    }

    try {
        valor = Double.parseDouble(valorText);
    } catch (NumberFormatException e) {
        // Tratar o erro de conversão do valor
        e.printStackTrace();
        return;
    }

    int tipo = Integer.parseInt(TipoTxt.getText());
    String dataString = DataText.getText();

try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/A3?serverTimezone=UTC", "root", "2503");

    // Converter a string de data em um objeto Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    java.util.Date parsedDate = dateFormat.parse(dataString);
    Date data = new Date(parsedDate.getTime());

    // Preparar a instrução SQL para inserção na tabela TB_GASTOS
    String insertQuery = "INSERT INTO TB_GASTOS (NOME, VALOR, TIPO, DATA) VALUES (?, ?, ?, ?)";
    PreparedStatement insertStatement = conn.prepareStatement(insertQuery);

    insertStatement.setString(1, nome);
    insertStatement.setDouble(2, valor);
    insertStatement.setInt(3, tipo);
    insertStatement.setDate(4, data);

    insertStatement.executeUpdate();
    insertStatement.close();
    conn.close();

    System.out.println("Registro adicionado com sucesso à tabela GASTOS.");

} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_AdicionarActionPerformed

    private void VerificarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarTiposActionPerformed
                                            
    // Obter os dados do banco de dados e exibi-los em um JOptionPane
    String url = "jdbc:mysql://localhost/A3?serverTimezone=UTC";
    String user = "root";
    String password = "2503";
    String tabela = "TB_TIPO";

    try (Connection connection = DriverManager.getConnection(url, user, password)) {
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM " + tabela;
        ResultSet resultSet = statement.executeQuery(sql);

        StringBuilder tipos = new StringBuilder();
        while (resultSet.next()) {
            int codigo = resultSet.getInt("CODIGO");
            String nome = resultSet.getString("NOME");
            tipos.append("Código: ").append(codigo).append(", Nome: ").append(nome).append("\n");
        }

        JOptionPane.showMessageDialog(this, tipos.toString(), "Tipos", JOptionPane.INFORMATION_MESSAGE);

        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_VerificarTiposActionPerformed

    private void ValorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTextActionPerformed

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
            java.util.logging.Logger.getLogger(AddGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JTextPane DataText;
    private javax.swing.JTextPane NomeText;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Tipo;
    private javax.swing.JTextField TipoTxt;
    private javax.swing.JTextField ValorText;
    private javax.swing.JButton VerificarTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
