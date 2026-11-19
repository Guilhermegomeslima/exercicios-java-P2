public class Moto extends Veiculo implements Transporte {
    private int cilindradas;
    private static final double TAXA_FIXA = 1.80;

    public Moto(String marca, String modelo, String placa, double custoKmRodado,
                String cor, int cilindradas) {
        super(marca, modelo, placa, custoKmRodado, cor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
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
        return "Tipo de Transporte: Moto\n"
                + "Marca: " + getMarca() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "Placa: " + getPlaca() + "\n"
                + "Cor: " + getCor() + "\n"
                + "Cilindradas: " + cilindradas + "cc";
    }
}
