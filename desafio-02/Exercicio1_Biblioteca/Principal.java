import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Ana Souza", "ana@email.com");
        Autor autor2 = new Autor("Carlos Lima", "carlos@email.com");
        Autor autor3 = new Autor("Marina Costa", "marina@email.com");

        List<Autor> autoresLivro1 = new ArrayList<Autor>();
        autoresLivro1.add(autor1);
        autoresLivro1.add(autor2);

        Livro livro1 = new Livro("Introducao ao Java", "9780000000011",
                "Programacao", "Livros sobre desenvolvimento de software", autoresLivro1);

        List<Autor> autoresLivro2 = new ArrayList<Autor>();
        autoresLivro2.add(autor3);

        Livro livro2 = new Livro("Historias do Brasil", "9780000000028",
                "Historia", "Livros sobre acontecimentos historicos", autoresLivro2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("=== LIVROS DA BIBLIOTECA ===");
        biblioteca.listarLivros();
    }
}
