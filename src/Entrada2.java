import java.util.Scanner;

public class Entrada2 {

    private Scanner scanner;

    public Entrada2() {
        scanner = new Scanner(System.in);
    }

    public long segundos() {
        System.out.println("Digite o valor em segundos que desejar");
        return scanner.nextLong();
    }

    public void fechar() {
        scanner.close();
    }

}
