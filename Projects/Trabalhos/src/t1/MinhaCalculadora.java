package t1;

import javax.swing.*;
import java.beans.Statement;

public class MinhaCalculadora {
    private double resultado=0;

    public double getResultado() {
        return resultado;
    }

    // soma
    public double soma(double n1, double n2) {
        this.resultado = n1 + n2;
        return resultado;
    }
    public double soma(double n1, double n2, double n3) {
        System.out.println(n1+n2+n3);
        this.resultado = n1 + n2 + n3;
        return resultado;
    }

    public double soma(double n1, double n2, double n3, double n4) {
        this.resultado = n1 + n2 + n3 + n4;
        return resultado;
    }

    public double subtracao(double n1, double n2) {
        this.resultado = n1 - n2;
        return resultado;
    }

    public double subtracao(double n1, double n2, double n3) {
        this.resultado = n1 - n2 - n3;
        return resultado;
    }

    public double subtracao(double n1, double n2, double n3, double n4) {
        this.resultado = n1 - n2 - n3 - n4;
        return resultado;
    }

    // multiplicação
    public double multiplicar(double n1, double n2) {
        this.resultado = n1 * n2;
        return resultado;
    }

    public double multiplicar(double n1, double n2, double n3) {
        this.resultado = n1 * n2 * n3;
        return resultado;
    }

    public double multiplicar(double n1, double n2, double n3, double n4) {
        this.resultado = n1 * n2 * n3 * n4;
        return resultado;
    }

    public double dividir(double n1, double n2) {
        this.resultado = n1 / n2;
        return resultado;
    }
    public double dividir(double n1, double n2, double n3) {
        this.resultado = n1/n2/n3;
        return resultado;
    }
    public double dividir(double n1, double n2, double n3, double n4) {
        this.resultado = n1/n2/n3/n4;
        return resultado;
    }
}