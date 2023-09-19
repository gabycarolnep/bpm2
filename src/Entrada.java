import java.util.Scanner;

public class Entrada {

        private Scanner scanner;

        public Entrada() {
            scanner = new Scanner(System.in);
        }

        public int quantidadeNumeros() {
            System.out.println("Digite a quantidade de números que deseja ordenar");
            return scanner.nextInt();
        }

        public int proximoNumero() {
            return scanner.nextInt();
        }

        public void fechar() {
            scanner.close();
        }

    }
