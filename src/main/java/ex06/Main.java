package ex06;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        int[] array1 = new int[]{50, -20, 0, 40};
        int[] array2 = new int[]{5, -50, 10, 60};
        int[] concatenate = ArrayUtils.addAll(array1, array2);

        float soma = 0;
        float media = 0;

        for (int item : concatenate) {
            soma = soma + item;
        }

        media = soma / concatenate.length;

        System.out.println("Valores do array 1: " + Arrays.toString(array1));
        System.out.println("Valores do array 2: " + Arrays.toString(array2));
        System.out.println("Arrays combinados: " + Arrays.toString(concatenate));
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f %n ", media);

    }
}
