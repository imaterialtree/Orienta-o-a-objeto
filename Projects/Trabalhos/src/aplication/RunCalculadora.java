package aplication;

import t2.Calculadora;

import javax.swing.*;
import java.util.Arrays;

public class RunCalculadora {
    public static void main(String[] args) {
        int qtdNum = (int) JOptionPane.showInputDialog(
                null, "Quantos números?",
                "Calculadora", JOptionPane.PLAIN_MESSAGE,
                null, new Object[] {2, 3, 4}, 2
        );
        double[] nums = new double[qtdNum];
        for (int i = 0; i < qtdNum; i++) {
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        }
        String resultado = "Números = "+ Arrays.toString(nums);
        switch (qtdNum) {
            case 2 -> {
                resultado += "\nSoma = "+Calculadora.soma(nums[0], nums[1]);
                resultado += "\nSubtração = "+Calculadora.subtracao(nums[0], nums[1]);
                resultado += "\nMultiplicação = "+Calculadora.multiplicar(nums[0], nums[1]);
                resultado += "\nDividisão = "+Calculadora.dividir(nums[0], nums[1]);
            }
            case 3 -> {
                resultado += "\nSoma = "+Calculadora.soma(nums[0], nums[1], nums[2]);
                resultado += "\nSubtração = "+Calculadora.subtracao(nums[0], nums[1], nums[2]);
                resultado += "\nMultiplicação = "+Calculadora.multiplicar(nums[0], nums[1], nums[2]);
                resultado += "\nDividisão = "+Calculadora.dividir(nums[0], nums[1], nums[2]);
            }
            case 4 -> {
                resultado += "\nSoma = "+Calculadora.soma(nums[0], nums[1], nums[2], nums[3]);
                resultado += "\nSubtração = "+Calculadora.subtracao(nums[0], nums[1], nums[2], nums[3]);
                resultado += "\nMultiplicação = "+Calculadora.multiplicar(nums[0], nums[1], nums[2], nums[3]);
                resultado += "\nDividisão = "+Calculadora.dividir(nums[0], nums[1], nums[2], nums[3]);
            }
        }
        JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
}
