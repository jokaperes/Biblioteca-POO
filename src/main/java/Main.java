package main.java;
import main.java.model.Livro;
import main.java.model.Usuario;
import main.java.view.MyFrame;
import javax.swing.*;
import javax.swing.JLabel;
import main.java.dao.CatalogoDAO;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        CatalogoDAO catalogoDAO = new CatalogoDAO();

        // Adicionando alguns livros
        catalogoDAO.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1234567890"));
        catalogoDAO.adicionarLivro(new Livro("1984", "George Orwell", "0987654321"));

        // Buscando livros por título
        List<Livro> livros = catalogoDAO.buscarPorTitulo("O Senhor dos Anéis");
        for (Livro livro : livros) {
            System.out.println("Encontrado: " + livro.getTitulo() + " por " + livro.getAutor());
        }
    }









    }
