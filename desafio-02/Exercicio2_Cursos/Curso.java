import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nome;
    private Modulo modulo;
    private List<Instrutor> instrutores;

    public Curso() {
        this.modulo = new Modulo();
        this.instrutores = new ArrayList<Instrutor>();
    }

    public Curso(String codigo, String nome, String tituloModulo,
                 int cargaHoraria, List<Instrutor> instrutores) {
        this.codigo = codigo;
        this.nome = nome;
        this.modulo = new Modulo(tituloModulo, cargaHoraria);
        setInstrutores(instrutores);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        if (modulo == null) {
            throw new IllegalArgumentException("O modulo nao pode ser nulo.");
        }
        this.modulo = new Modulo(modulo.getTitulo(), modulo.getCargaHoraria());
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        if (instrutores == null) {
            throw new IllegalArgumentException("A lista de instrutores nao pode ser nula.");
        }
        this.instrutores = new ArrayList<Instrutor>(instrutores);
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        if (instrutor == null) {
            throw new IllegalArgumentException("O instrutor nao pode ser nulo.");
        }
        instrutores.add(instrutor);
    }
}
