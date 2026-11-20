import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Valor<?>> valores = new ArrayList<Valor<?>>();
        int quantidade;

        System.out.print("Quantidade de valores? ");
        try {
            quantidade = Integer.parseInt(scanner.nextLine());
            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Quantidade invalida. Informe um numero inteiro.");
            scanner.close();
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            String entrada = scanner.nextLine();

            try {
                Integer numero = Integer.parseInt(entrada);
                valores.add(new Valor<Integer>(numero, entrada));
            } catch (NumberFormatException e1) {
                try {
                    Double numero = Double.parseDouble(entrada);
                    valores.add(new Valor<Double>(numero, entrada));
                } catch (NumberFormatException e2) {
                    valores.add(new Valor<String>(entrada, entrada));
                }
            }
        }

        System.out.println();
        System.out.println("Valores informados: " + valores);
        System.out.println("Primeiro valor: " + valores.get(0));
        scanner.close();
    }
}
