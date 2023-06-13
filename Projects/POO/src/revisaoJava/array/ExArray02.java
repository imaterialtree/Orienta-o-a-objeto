package revisaoJava.array;

import java.util.Arrays;

public class ExArray02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i]*2;
        System.out.println("Vetor a: "+Arrays.toString(a));
        System.out.println("Vetor b: "+ Arrays.toString(b));
    }
}
