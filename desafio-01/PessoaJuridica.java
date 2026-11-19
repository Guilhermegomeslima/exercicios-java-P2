public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(String nome, String endereco, String telefone, String email,
                          String cnpj, double faturamento) {
        super(nome, endereco, telefone, email);
        if (faturamento < 0) {
            throw new IllegalArgumentException("O faturamento nao pode ser negativo.");
        }
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    @Override
    public double calcularImposto() {
        return faturamento * 0.06;
    }

    public void exibirDados() {
        System.out.println("Pessoa Juridica");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Faturamento: R$ " + faturamento);
        System.out.println("Imposto: R$ " + calcularImposto());
        System.out.println();
    }
}
