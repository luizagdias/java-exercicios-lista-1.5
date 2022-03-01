package ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        int[] valores = new int[4];
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        while (i < 4) {
            System.out.print("Digite o valor " + (i + 1) + " : ");
            valores[i] = scanner.nextInt();
            i++;
        }

        calc(valores);
    }

    private void calc(int[] valores) {
        Arrays.sort(valores);
        int min = valores[0];
        int max = valores[valores.length - 1];

        System.out.println("-------------------------");
        System.out.println("O menor valor é: " + min);
        System.out.println("O maior valor é: " + max);

        if (max > 50) {
            System.out.println("Valor muito alto");
        } else {
            System.out.println("Valor normal");
        }
    }
}
