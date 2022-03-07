package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        int i = 0;
        float valor = 0;
        ArrayList<Float> valores = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor " + (i + 1) + " : ");
        valor = scanner.nextFloat();

        while (valor != -1) {
            valores.add(i, valor);
            i++;
            System.out.print("Digite o valor " + (i + 1) + " : ");
            valor = scanner.nextFloat();
        }

        if (valor == -1 && valores.size() < 4) {
            System.out.println("Por favor, digite no mínimo 4 valores");
            start();
        } else {
            calc(valores);
        }
    }

    private void calc(ArrayList<Float> valores) {
        float soma = 0;
        float media = 0;

        for (float item : valores) {
            soma = soma + item;
        }

        media = soma / valores.size();

        System.out.println("-------------------------");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
