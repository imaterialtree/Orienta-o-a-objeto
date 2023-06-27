package t3.ex2;

import java.util.Arrays;

public class TestarAnimais {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Animal tubarao = new Peixe("Tubarao Martelo", 3.6f, 0, "cinza", "água salgada", 12, "Cabeça de martelo");
        Animal camelo = new Mamifero("Camelo do Saara", 3.1f, 4, "marrom", "terrestre", 40, "vegetais");

        tubarao.relatorio();
        System.out.println();
        camelo.relatorio();
    }
}
