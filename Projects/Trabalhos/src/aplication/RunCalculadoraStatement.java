package aplication;

import t1.MinhaCalculadora;

import javax.swing.*;
import java.beans.Statement;

public class RunCalculadoraStatement {
    public static void main(String[] args) throws Exception {
        System.out.println("Quantos números operar?");
        int qtdNum = (int) JOptionPane.showInputDialog(null, "Quantos números?", "Calculadora", JOptionPane.PLAIN_MESSAGE, null, new Object[] {2, 3, 4}, 2);
        Object[] nums = new Object[qtdNum];
        System.out.println("Que operação?");
        Object[] options = new Object[] {"soma", "subtracao", "multiplicar", "dividir"};
        String operacao = (String) JOptionPane.showInputDialog(null, "Escolha uma operaçao",
                "Calculadora", JOptionPane.PLAIN_MESSAGE,
                null, options, "soma");
        for (int i = 0; i < qtdNum; i++) {
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        }
        MinhaCalculadora calculadora = new MinhaCalculadora();
        new Statement(calculadora, operacao, nums).execute();
        JOptionPane.showMessageDialog(null, "O resultado é "+calculadora.getResultado());
    }
}
