public class Principal {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica1 = new PessoaFisica(
            "Erick Valentim", "Rua Augusta, 10", "32999990001", "erickValentim@email.com",
            "111.222.333-44", 500.00);
        PessoaFisica pessoaFisica2 = new PessoaFisica(
            "José Arnaldo", "Morro aleatório, 25", "32999990002", "joseads@email.com",
            "222.333.444-55", 4500.00);

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica(
            "NET gótica", "Avenida Brasil, 100", "3233330001", "netgoth@email.com",
            "11.222.333/0001-44", 90000.00);
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica(
            "Oficina do Simas", "Rua do Comercio, 50", "3233330002", "oficinasimas@email.com",
            "22.333.444/0001-55", 35000.00);

        FuncionarioEfetivo efetivo1 = new FuncionarioEfetivo(
            "Willian Leal", "E001", "Educação", "10/01/2024", 22.00, 13.00);
        FuncionarioEfetivo efetivo2 = new FuncionarioEfetivo(
            "Daniela Costa", "E002", "RH", "15/03/2025", 4000.00, 300.00);

        FuncionarioTemporario temporario1 = new FuncionarioTemporario(
            "Eduardo Alves", "T001", "Vendas", "01/08/2026", 20.00, 150);
        FuncionarioTemporario temporario2 = new FuncionarioTemporario(
            "Fernanda Rocha", "T002", "Estoque", "01/09/2026", 25.00, 180);

        pessoaFisica1.exibirDados();
        pessoaFisica2.exibirDados();
        pessoaJuridica1.exibirDados();
        pessoaJuridica2.exibirDados();
        efetivo1.exibirDados();
        efetivo2.exibirDados();
        temporario1.exibirDados();
        temporario2.exibirDados();
    }
}
