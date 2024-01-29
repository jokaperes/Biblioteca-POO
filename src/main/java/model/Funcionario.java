package main.java.model;

public class Funcionario {
    private String nome;
    private String cpf;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
