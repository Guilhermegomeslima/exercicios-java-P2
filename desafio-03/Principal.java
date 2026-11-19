import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Polimorfismo: referencias Transporte para objetos Carro e Moto.
        Transporte carro1 = new Carro("Toyota", "Corolla", "ABC-1234", 1.50, "Prata", 4);
        Transporte carro2 = new Carro("Fiat", "Argo", "DEF-4321", 1.30, "Branco", 4);
        Transporte moto1 = new Moto("Honda", "CBR 500R", "XYZ-5678", 0.95, "Vermelha", 500);
        Transporte moto2 = new Moto("Yamaha", "Fazer 250", "GHI-8765", 0.80, "Azul", 250);

        ContabilizacaoCorridas contabilizacao = new ContabilizacaoCorridas();

        System.out.println("=====================================================");
        System.out.println("Sistema de Calculo de Corrida por Tipo de Transporte");

        exibirCorrida(carro1, 15.5, contabilizacao);
        exibirCorrida(moto1, 15.5, contabilizacao);
        exibirCorrida(carro2, 10.0, contabilizacao);
        exibirCorrida(moto2, 20.0, contabilizacao);

        System.out.println("=====================================================");
        System.out.println("RESUMO DA JORNADA");
        System.out.println("Total de Corridas Realizadas: " + contabilizacao.getQuantidadeCorridas());
        System.out.printf("Valor Total Arrecadado: R$ %.2f%n", contabilizacao.getValorTotal());
        System.out.println("=====================================================");
    }

    public static void exibirCorrida(Transporte transporte, double distanciaKm,
                                    ContabilizacaoCorridas contabilizacao) {
        double valor = contabilizacao.registrarCorrida(transporte, distanciaKm);

        System.out.println("-----------------------------------------");
        System.out.println("Distancia da Corrida: " + distanciaKm + " Km");
        System.out.println("-----------------------------------------");
        System.out.println(transporte.exibirDescricao());

        if (transporte instanceof Carro) {
            Carro carro = (Carro) transporte;
            System.out.printf("Custo por Km: R$ %.2f%n", carro.getCustoKmRodado());
            System.out.printf("Taxa Fixa: R$ %.2f%n", carro.getTaxaFixa());
        } else if (transporte instanceof Moto) {
            Moto moto = (Moto) transporte;
            System.out.printf("Custo por Km: R$ %.2f%n", moto.getCustoKmRodado());
            System.out.printf("Taxa Fixa: R$ %.2f%n", moto.getTaxaFixa());
        }
        System.out.printf("Custo Total da Corrida: R$ %.2f%n%n", valor);
    }
}
