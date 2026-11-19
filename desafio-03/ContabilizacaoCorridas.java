public class ContabilizacaoCorridas {
    private int quantidadeCorridas;
    private double valorTotal;

    public ContabilizacaoCorridas() {
        quantidadeCorridas = 0;
        valorTotal = 0;
    }

    public double registrarCorrida(Transporte transporte, double distanciaKm) {
        if (transporte == null) {
            throw new IllegalArgumentException("O transporte nao pode ser nulo.");
        }
        double valorCorrida = transporte.calcularCusto(distanciaKm);
        quantidadeCorridas++;
        valorTotal += valorCorrida;
        return valorCorrida;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
