package aula5;

public class Tester {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0103, 1543.5, false, 1000);
        System.out.println(cc.toString());

        cc.sacar(2000);
        System.out.println(cc.getSaldo());
        cc.depositar(500);

        System.out.println(cc.toString());
    }
}
