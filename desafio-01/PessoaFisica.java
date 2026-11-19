public class PessoaFisica extends Pessoa {
    private String cpf;
    private double salario;

    public PessoaFisica(String nome, String endereco, String telefone, String email,
                        String cpf, double salario) {
        super(nome, endereco, telefone, email);
        if (salario < 0) {
            throw new IllegalArgumentException("O salario nao pode ser negativo.");
        }
        this.cpf = cpf;
        this.salario = salario;
    }

    @Override
    public double calcularImposto() {
        return salario * 0.20;
    }

    public void exibirDados() {
        System.out.println("Pessoa Fisica");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Imposto: R$ " + calcularImposto());
        System.out.println();
    }
}
