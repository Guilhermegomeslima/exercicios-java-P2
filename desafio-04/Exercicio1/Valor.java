public class Valor<T> {
    private T conteudo;
    private String textoOriginal;

    public Valor(T conteudo, String textoOriginal) {
        this.conteudo = conteudo;
        this.textoOriginal = textoOriginal;
    }

    public T getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return textoOriginal;
    }
}
