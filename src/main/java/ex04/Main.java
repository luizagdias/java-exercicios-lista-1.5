package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        String text = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");

        text = scanner.nextLine();

        System.out.printf("%s%d", "Int: ", Integer.parseInt(text));
    }
}
