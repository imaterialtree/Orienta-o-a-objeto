package revisaoJava.array;

import java.util.Arrays;
import java.util.Random;

public class ExArray03 {
    public static void main(String[] args) {
        Random rd = new Random();
        // Preencher a e b com valores aleatórios
        int[] a = new int[10], b = new int[10], c = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(1, 10);
            b[i] = rd.nextInt(1, 10);
        }
        // Preencher c
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println("Vetor a: " + Arrays.toString(a));
        System.out.println("Vetor b: " + Arrays.toString(b));
        System.out.println("Vetor c: " + Arrays.toString(c));
    }
}
