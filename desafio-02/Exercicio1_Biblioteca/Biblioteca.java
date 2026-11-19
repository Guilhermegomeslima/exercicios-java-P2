import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
    }

    public Biblioteca(List<Livro> livros) {
        setLivros(livros);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        if (livros == null) {
            throw new IllegalArgumentException("A lista de livros nao pode ser nula.");
        }
        this.livros = new ArrayList<Livro>(livros);
    }

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("O livro nao pode ser nulo.");
        }
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Categoria: " + livro.getCategoria().getNome());
            System.out.println("Descricao: " + livro.getCategoria().getDescricao());
            System.out.println("Autores:");
            for (Autor autor : livro.getAutores()) {
                System.out.println("  Nome: " + autor.getNome());
                System.out.println("  Email: " + autor.getEmail());
            }
            System.out.println();
        }
    }
}
