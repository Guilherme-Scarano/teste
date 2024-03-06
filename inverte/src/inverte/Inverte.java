package inverte;

import java.util.Scanner;

public class Inverte {

    public static String inverteString(String string) {
        StringBuilder invertedString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            invertedString.append(string.charAt(i));
        }
        return invertedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = scanner.nextLine();
        scanner.close();

        String stringInvertida = inverteString(stringOriginal);
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
    }
}
