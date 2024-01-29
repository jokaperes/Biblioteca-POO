package main.java.model;

public class Livro {
        private String idLivro;
        private String titulo;
        private String autor;
        private String categoria;
        private int anoPublicacao;
        private String editora;
        private int quantidadeEstoque;

        public Livro(String idLivro, String titulo, String autor, String categoria, int anoPublicacao, int quantidadeEstoque) {
            this.idLivro = idLivro;
            this.titulo = titulo;
            this.autor = autor;
            this.categoria = categoria;
            this.anoPublicacao = anoPublicacao;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public boolean estaDisponivel() {
            return quantidadeEstoque > 0;
        }


    }


