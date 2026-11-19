import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String isbn;
    private Categoria categoria;
    private List<Autor> autores;

    public Livro() {
        this.categoria = new Categoria();
        this.autores = new ArrayList<Autor>();
    }

    public Livro(String titulo, String isbn, String nomeCategoria,
                 String descricaoCategoria, List<Autor> autores) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.categoria = new Categoria(nomeCategoria, descricaoCategoria);
        setAutores(autores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("A categoria nao pode ser nula.");
        }
        this.categoria = new Categoria(categoria.getNome(), categoria.getDescricao());
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        if (autores == null) {
            throw new IllegalArgumentException("A lista de autores nao pode ser nula.");
        }
        this.autores = new ArrayList<Autor>(autores);
    }

    public void adicionarAutor(Autor autor) {
        if (autor == null) {
            throw new IllegalArgumentException("O autor nao pode ser nulo.");
        }
        autores.add(autor);
    }
}
