package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        int i = 0;
        String text = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra ou frase: ");

        text = scanner.nextLine();

        invert(text);

        /* Inverter texto sem for:
        text = new StringBuilder(text).reverse().toString();
        System.out.println(text);
        */
    }

    private void invert(String text) {
        int len = text.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        for (int i = 0; i < len; i++) {
            tempCharArray[i] = text.charAt(i);
        }

        for (int i = 0; i < len; i++) {
            charArray[i] = tempCharArray[len - 1 - i];
        }

        String invertText = new String(charArray);
        System.out.println(invertText);
    }
}
