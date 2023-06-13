package revisaoJava.array;

import java.util.Arrays;
import java.util.Random;

public class ExArray04 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];

        // Preencher com idades de 1-80
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(1, 80);
        }
        // Inicializar variáveis
        int maxAge = a[0];
        int minAge = a[0];
        int maxPos=0, minPos=0;

        for (int i = 1; i < a.length; i++) {
            // Para cada valor, verificar se é maior
            if (a[i]>maxAge) {
                maxAge=a[i];
                maxPos = i;
            }
            // Para cada valor, verificar se é menor
            if (a[i]<minAge) {
                minAge = a[i];
                minPos = i;
            }
        }
        System.out.println("Idades: "+ Arrays.toString(a));
        System.out.printf("Maximo: %d \tPosição: %d\n", maxAge, maxPos);
        System.out.printf("Minimo: %d \tPosição: %d", minAge, minPos);
    }
}
