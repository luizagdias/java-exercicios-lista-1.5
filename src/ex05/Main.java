package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        String phrase = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Frase: ");

        phrase = scanner.nextLine();

        if (phrase.length() == 0) {
            System.out.println("Nada foi digitado.");
        } else {
            String[] stringArray = phrase.split(" ");
            int lenArray = stringArray.length;

            if (lenArray == 1) {
                System.out.println("Foi digitado apenas uma palavra: " + stringArray[0]);
            } else if (lenArray > 4) {
                System.out.println("Penúltima palavra: " + stringArray[lenArray - 2]);
                System.out.println("Texto muito longo.");
            } else {
                System.out.println("Penúltima palavra: " + stringArray[lenArray - 2]);
            }
        }
    }
}
