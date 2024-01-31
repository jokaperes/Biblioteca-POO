package main.java.model;

public class Usuario {
    private String cpf;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;



   public class Usuario extends Funcionario{


    private String endereco;

    private String telefone;



    public Usuario( String endereco,String telefone, String categoria) {

        this.endereco = endereco;

        this.telefone = telefone;

    }

    public Usuario() {

    }




    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
