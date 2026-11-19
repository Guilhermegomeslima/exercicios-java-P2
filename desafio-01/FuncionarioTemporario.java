public class FuncionarioTemporario extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioTemporario(String nome, String matricula, String departamento,
                                String dataAdmissao, double valorHora, int horasTrabalhadas) {
        super(nome, matricula, departamento, dataAdmissao);
        if (valorHora < 0 || horasTrabalhadas < 0) {
            throw new IllegalArgumentException("Valor da hora e horas trabalhadas nao podem ser negativos.");
        }
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        double total = valorHora * horasTrabalhadas;
        if (horasTrabalhadas > 160) {
            total += (horasTrabalhadas - 160) * valorHora * 0.50;
        }
        return total;
    }

    public void exibirDados() {
        System.out.println("Funcionario Temporario");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Data de admissao: " + getDataAdmissao());
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salario calculado: R$ " + calcularSalario());
        System.out.println();
    }
}
