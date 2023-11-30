package sistemausuario;

// Classe UsuarioLogado
    public class UsuarioLogado {
    private static String nome;
    private static int id;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        UsuarioLogado.nome = nome;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UsuarioLogado.id = id;
    }
}
