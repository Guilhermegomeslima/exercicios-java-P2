
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Instrutor instrutor1 = new Instrutor("Willian Leal", "Java");
        Instrutor instrutor2 = new Instrutor("Flavio Motta", "Java");
        Instrutor instrutor3 = new Instrutor("Nilton Freitas", "Redes");

        List<Instrutor> instrutoresCurso1 = new ArrayList<Instrutor>();
        instrutoresCurso1.add(instrutor1);
        instrutoresCurso1.add(instrutor2);

        Curso curso1 = new Curso("C001", "Desenvolvimento Java",
                "Projeto Orientado a Objetos", 40, instrutoresCurso1);

        List<Instrutor> instrutoresCurso2 = new ArrayList<Instrutor>();
        instrutoresCurso2.add(instrutor3);

        Curso curso2 = new Curso("C002", "Introducao a Redes",
                "Redes e Comunicação Digital", 30, instrutoresCurso2);

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);
        cursos.add(curso2);

        System.out.println("=== CURSOS CADASTRADOS ===");
        for (Curso curso : cursos) {
            System.out.println("Codigo: " + curso.getCodigo());
            System.out.println("Nome: " + curso.getNome());
            System.out.println("Modulo: " + curso.getModulo().getTitulo());
            System.out.println("Carga horaria: " + curso.getModulo().getCargaHoraria() + " horas");
            System.out.println("Instrutores:");
            for (Instrutor instrutor : curso.getInstrutores()) {
                System.out.println("  Nome: " + instrutor.getNome());
                System.out.println("  Especialidade: " + instrutor.getEspecialidade());
            }
            System.out.println();
        }
    }
}
