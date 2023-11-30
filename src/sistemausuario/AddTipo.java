
package sistemausuario;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;



public class AddTipo extends javax.swing.JFrame {

    public AddTipo() {
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

        Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Adicionar = new javax.swing.JButton();
        VerificarTipos = new javax.swing.JButton();
        excluirTipo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tipoText = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        idTxt = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        VerificarTipos.setText("Verificar Tipos");
        VerificarTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarTiposActionPerformed(evt);
            }
        });
        getContentPane().add(VerificarTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, -1));

        excluirTipo.setText("Excluir Tipo");
        excluirTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirTipoActionPerformed(evt);
            }
        });
        getContentPane().add(excluirTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 110, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        tipoText.setBackground(new java.awt.Color(126, 190, 252));
        tipoText.setForeground(new java.awt.Color(0, 0, 0));
        tipoText.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tipoText);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, -1));

        idTxt.setBackground(new java.awt.Color(126, 190, 252));
        idTxt.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(idTxt);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 250, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\fabio\\OneDrive\\Documentos\\NetBeansProjects\\SistemaUsuario\\build\\classes\\sistemausuario\\Fundo1.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("Fundo1");

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

    // Obter o valor do nome do tipo
    String nomeTipo = tipoText.getText();

    // Estabelecer conexão com o banco de dados
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/A3?serverTimezone=UTC", "root", "2503");

        // Preparar a instrução SQL para inserção
        String sql = "INSERT INTO TB_TIPO (NOME) VALUES (?)";
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        // Atribuir o valor ao parâmetro da instrução SQL
        stmt.setString(1, nomeTipo);

        // Executar a instrução SQL
        stmt.executeUpdate();

        // Obter o ID (código) gerado automaticamente
        ResultSet rs = stmt.getGeneratedKeys();
        int codigo = 0;
        if (rs.next()) {
            codigo = rs.getInt(1);
        }

        // Fechar a conexão e o statement
        stmt.close();
        conn.close();

        // Exibir uma mensagem de sucesso ou realizar outras ações necessárias
        System.out.println("Registro adicionado com sucesso à tabela TB_TIPO. Código gerado: " + codigo);

    } catch (SQLException e) {
        // Lidar com exceções, se ocorrerem
        e.printStackTrace();
    }


    }//GEN-LAST:event_AdicionarActionPerformed

    private void VerificarTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarTiposActionPerformed
    String url = "jdbc:mysql://localhost/A3?serverTimezone=UTC";
String user = "root";
String password = "2503";
String tabela = "TB_TIPO";

try (Connection connection = DriverManager.getConnection(url, user, password)) {
    Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    String sql = "SELECT * FROM " + tabela;
    ResultSet resultSet = statement.executeQuery(sql);

    if (resultSet.next()) {
        String[] columnNames = {"Código", "Nome"};
        resultSet.last(); // Mover o cursor para a última linha
        int rowCount = resultSet.getRow(); // Obter o número de linhas
        resultSet.beforeFirst(); // Mover o cursor para antes da primeira linha

        Object[][] data = new Object[rowCount][2];

        int rowIndex = 0;
        while (resultSet.next()) {
            int codigo = resultSet.getInt("CODIGO");
            String nome = resultSet.getString("NOME");
            data[rowIndex][0] = codigo;
            data[rowIndex][1] = nome;
            rowIndex++;
        }

        JTable table = new JTable(data, columnNames);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = table.getSelectedRow();

                if (selectedRow != -1) {
                    int codigo = (int) table.getValueAt(selectedRow, 0);
                    String nome = (String) table.getValueAt(selectedRow, 1);

                    // Atualizar os campos com as informações do tipo selecionado
                    idTxt.setText(String.valueOf(codigo));
                    tipoText.setText(nome);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        JOptionPane.showMessageDialog(null, scrollPane, "Tipos", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Não há tipos cadastrados.");
    }

    resultSet.close();
    statement.close();
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Erro ao executar consulta SQL: " + e.getMessage());
}

    }//GEN-LAST:event_VerificarTiposActionPerformed

    private void excluirTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirTipoActionPerformed
        // Obter o tipo a ser excluído do campo de entrada (supondo que você tenha um campo chamado "tipoText")
    String tipo = tipoText.getText();

    try {
        // Chamar o método DAO para excluir o tipo
        DAO dao = new DAO();
        dao.excluirTipo(tipo);

        // Exibindo uma mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Tipo excluído com sucesso.");
    } catch (SQLException e) {
        // Lidar com exceções SQL
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao excluir o tipo: " + e.getMessage());
    }

    }//GEN-LAST:event_excluirTipoActionPerformed

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
            java.util.logging.Logger.getLogger(AddTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton Sair;
    private javax.swing.JButton VerificarTipos;
    private javax.swing.JButton excluirTipo;
    private javax.swing.JTextPane idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane tipoText;
    // End of variables declaration//GEN-END:variables
}