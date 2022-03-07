package ex07;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        int i = 0;
        String valorArray1;
        String valorArray2;

        ArrayList<Integer> array1 = new ArrayList();
        ArrayList<Integer> array2 = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores do primeiro Array e para finalizar digite 01");
        System.out.print("Digite o valor " + (i + 1) + " : ");

        valorArray1 = scanner.nextLine();


        while (valorArray1 != "sair") {
            testeValorArray1(valorArray1);
            array1.add(i, Integer.parseInt(valorArray1));
            i++;
            System.out.print("Digite o valor " + (i + 1) + " : ");
            valorArray1 = scanner.nextLine();
        }

        i = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.println("Digite os valores do segundo Array e para finalizar digite 00");
        System.out.print("Digite o valor " + (i + 1) + " : ");

        valorArray2 = scanner.nextLine();


        while (valorArray2 != "sair") {
            testeValorArray2(valorArray2);
            array2.add(i, Integer.parseInt(valorArray2));
            i++;
            System.out.print("Digite o valor " + (i + 1) + " : ");
            valorArray2 = scanner.nextLine();
        }

        ArrayList<Integer> concatArray = new ArrayList();
        concatArray.addAll(array1);
        concatArray.addAll(array2);

        float soma = 0;
        float media = 0;


        for (int item : concatArray) {
            soma = soma + item;
        }

        media = soma / concatArray.size();

        System.out.println("Valores do array 1: " + array1.toString());
        System.out.println("Valores do array 2: " + array2.toString());
        System.out.println("Arrays combinados: " + concatArray.toString());
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f %n ", media);
    }

    private void testeValorArray1(String valorArray1) {
        while (Integer.parseInt(valorArray1) < -100 || Integer.parseInt(valorArray1) > 100) {
            System.out.print("Por favor, digite um valor entre -100 e 100: ");
            Scanner scanner = new Scanner(System.in);
            valorArray1 = scanner.nextLine();
        }
    }

    private void testeValorArray2(String valorArray2) {
        while (Integer.parseInt(valorArray2) < -100 || Integer.parseInt(valorArray2) > 100) {
            System.out.print("Por favor, digite um valor entre -100 e 100: ");
            Scanner scanner = new Scanner(System.in);
            valorArray2 = scanner.nextLine();
        }
    }
}
