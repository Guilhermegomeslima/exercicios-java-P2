public class Modulo {
    private String titulo;
    private int cargaHoraria;

    public Modulo() {
    }

    public Modulo(String titulo, int cargaHoraria) {
        this.titulo = titulo;
        setCargaHoraria(cargaHoraria);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria < 0) {
            throw new IllegalArgumentException("A carga horaria nao pode ser negativa.");
        }
        this.cargaHoraria = cargaHoraria;
    }
}
