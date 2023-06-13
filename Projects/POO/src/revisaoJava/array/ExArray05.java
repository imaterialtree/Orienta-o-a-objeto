package revisaoJava.array;

import java.util.Scanner;

public class ExArray05 {
    public static void main(String[] args) {
        // Palindromo
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número grande");
        String sNum = input.nextLine();
        String[] vetNum = sNum.split("");
        boolean isPalindromo = true;
        for (int i=0; i< vetNum.length/2; i++) {
            if (!vetNum[i].equals(vetNum[(vetNum.length-1)-i])) {
                isPalindromo = false;
                break;
            }
        }
        System.out.println(isPalindromo ? "É um palíndromo" : "Não é um palíndromo");
    }
}
