public class Carro extends Veiculo implements Transporte {
    private int numPortas;
    private static final double TAXA_FIXA = 2.50;

    public Carro(String marca, String modelo, String placa, double custoKmRodado,
                 String cor, int numPortas) {
        super(marca, modelo, placa, custoKmRodado, cor);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public double getTaxaFixa() {
        return TAXA_FIXA;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("A distancia nao pode ser negativa.");
        }
        return distanciaKm * getCustoKmRodado() + TAXA_FIXA;
    }

    @Override
    public String exibirDescricao() {
        return "Tipo de Transporte: Carro\n"
                + "Marca: " + getMarca() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "Placa: " + getPlaca() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Numero de Portas: " + numPortas;
    }
}
