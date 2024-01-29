package main.java.model;

public class Usuario {
    private String cpf;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;



    public Usuario(String cpf, String nome, String endereco, String email, String telefone, String categoria) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;

    }



    public String getId() {
        return cpf;
    }

    public void setId(int id) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Membro{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
