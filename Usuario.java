public class Usuario {
    private int id;
    private String username;
    private String email;

    // Construtor
    public Usuario(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para exibir informações do usuário (útil para testes)
    public void exibirInformacoes() {
        System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email);
    }
}
