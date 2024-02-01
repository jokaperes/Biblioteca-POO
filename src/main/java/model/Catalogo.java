package main.java.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Catalogo {
        private List<Livro> livros;

        public Catalogo() {
            this.livros = new ArrayList<>();
        }

        public void adicionarLivro(Livro livro) {
            this.livros.add(livro);
        }

        public void removerLivro(Livro livro) {
            this.livros.remove(livro);
        }

        public List<Livro> buscarPorTitulo(String titulo) {
            return livros.stream()
                    .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                    .collect(Collectors.toList());
        }

        public List<Livro> listarLivros() {
            return new ArrayList<>(this.livros);
        }
}
