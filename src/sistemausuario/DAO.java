package sistemausuario;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;



public class DAO {
        public boolean existe (Usuario usuario) throws Exception{
       String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
       try (Connection conn = ConexaoDB.obtemConexao();
           PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, usuario.getNome());
           ps.setString(2, usuario.getSenha());
           try (ResultSet rs = ps.executeQuery()){
               return rs.next();
           }
       }
    }
 public List<Usuario> obterTodosUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id, nome, senha FROM usuario";
        
        try (Connection conn = ConexaoDB.obtemConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                
                Usuario usuario = new Usuario(id, nome, senha);
                usuarios.add(usuario);
            }
        }
        
        return usuarios;
    }
     public void excluirTipo(String tipo) throws SQLException {
        String sql = "DELETE FROM TB_TIPO WHERE nome = ?";
        try (Connection conn = ConexaoDB.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tipo);
            ps.executeUpdate();
        }
    }

    public void atualizarUsuario(Usuario usuario) throws SQLException {
    String sql = "UPDATE usuario SET nome = ?, senha = ? WHERE id = ?";
    
    try (Connection conn = ConexaoDB.obtemConexao();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
        ps.setInt(3, usuario.getId());
        
        ps.executeUpdate();
    }
}
    public void excluirUsuario(int idUsuario) throws SQLException {
    String sql = "DELETE FROM usuario WHERE id = ?";
    try (Connection conn = ConexaoDB.obtemConexao();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, idUsuario);
        ps.executeUpdate();
    }
}
public List<Gasto> obterTodosGastos() throws SQLException {
    List<Gasto> gastos = new ArrayList<>();
    String sql = "SELECT id, data, descricao, valor FROM TB_GASTO";

    try (Connection conn = ConexaoDB.obtemConexao();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            int id = rs.getInt("id");
            LocalDate data = rs.getDate("data").toLocalDate();
            String descricao = rs.getString("descricao");
            double valor = rs.getDouble("valor");

            Gasto gasto = new Gasto(descricao, valor, id, data);
            gastos.add(gasto);
        }
    }

    return gastos;
}

}


    
