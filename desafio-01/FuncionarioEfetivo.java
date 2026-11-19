public class FuncionarioEfetivo extends Funcionario {
    private double salarioBase;
    private double gratificacao;

    public FuncionarioEfetivo(String nome, String matricula, String departamento,
                             String dataAdmissao, double salarioBase, double gratificacao) {
        super(nome, matricula, departamento, dataAdmissao);
        if (salarioBase < 0 || gratificacao < 0) {
            throw new IllegalArgumentException("Salario-base e gratificacao nao podem ser negativos.");
        }
        this.salarioBase = salarioBase;
        this.gratificacao = gratificacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + gratificacao + (salarioBase * 0.10);
    }

    public void exibirDados() {
        System.out.println("Funcionario Efetivo");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Data de admissao: " + getDataAdmissao());
        System.out.println("Salario-base: R$ " + salarioBase);
        System.out.println("Gratificacao: R$ " + gratificacao);
        System.out.println("Salario calculado: R$ " + calcularSalario());
        System.out.println();
    }
}
