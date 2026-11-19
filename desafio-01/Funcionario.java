public abstract class Funcionario {
    private String nome;
    private String matricula;
    private String departamento;
    private String dataAdmissao;

    public Funcionario(String nome, String matricula, String departamento, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getDepartamento() { return departamento; }
    public String getDataAdmissao() { return dataAdmissao; }

    public abstract double calcularSalario();
}
