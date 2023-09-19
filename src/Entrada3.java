import java.util.Scanner;

public class Entrada3 {

    private Scanner scanner;

    public Entrada3() {
        scanner = new Scanner(System.in);
    }

    public int calculoFibonacci() {
        System.out.println("Digite o numero inteiro positivo que desejar");
        return scanner.nextInt();
    }

    public void fechar() {
        scanner.close();
    }
}
