import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor 1: ");
        String primeiro = scanner.nextLine();

        System.out.print("Informe o valor 2: ");
        String segundo = scanner.nextLine();

        ChaveValor<String, String> par = new ChaveValor<String, String>(primeiro, segundo);

        System.out.println();
        System.out.println("Valores informados:");
        System.out.println("Valor 1: " + par.getValor1());
        System.out.println("Valor 2: " + par.getValor2());

        scanner.close();
    }
}
