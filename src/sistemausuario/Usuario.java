package sistemausuario;

public class Usuario {
    private String nome;
    private String senha;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.id = id;
    }

    public Usuario(String nome) {
        this.nome = nome;
        
    }
}
