package aula5;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean isSpecial; // especial ou não
    private double limite;

    public ContaCorrente(int numero, double saldo, boolean isSpecial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.isSpecial = isSpecial;
        this.limite = isSpecial ? limite : 0;
    }

    public boolean sacar(double quantidade) {
        if (saldo+limite > quantidade) {
                saldo -= quantidade;
                return true;
        }
        return false;
    }

    public void depositar(double quantidade) {
        saldo += quantidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isSpecial() {
        System.out.println(isSpecial ? "Conta especial" : "Conta não especial");
        return isSpecial;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", isSpecial=" + isSpecial +
                ", limite=" + limite +
                '}';
    }
}
