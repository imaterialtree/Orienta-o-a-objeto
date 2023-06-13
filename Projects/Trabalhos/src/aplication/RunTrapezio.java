/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;

import t1.Trapezio;

import javax.swing.*;
import java.util.Arrays;

public class RunTrapezio {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Vamos criar um trapézio. \nDigite as medidas em pixels", "Trapézio", JOptionPane.PLAIN_MESSAGE);
        int baseMenor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da BASE MENOR"));
        int baseMaior = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da BASE MAIOR"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da ALTURA"));
        Trapezio trapezio = new Trapezio(baseMenor, baseMaior, altura);
        JFrame frame = initFrame();
        frame.add(trapezio);

        final String[] options = {"Alterar base menor", "Alterar base maior", "Alterar altura", "Sair"};
        final int SAIR = Arrays.asList(options).indexOf("Sair");
        int op;
        do {
            op = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Trapézio", 0, JOptionPane.PLAIN_MESSAGE, null, options, null);
            System.out.println(op);
            switch (op) {
                case 0 -> {
                    trapezio.setBaseMenor(Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                                    "Digite uma nova base menor",
                                    "Alterar base menor",
                                    JOptionPane.PLAIN_MESSAGE)));
                    frame.update(trapezio.getGraphics());
                }

                case 1 -> {
                    trapezio.setBaseMaior(Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                                    "Digite uma nova base maior",
                                    "Alterar base maior",
                                    JOptionPane.PLAIN_MESSAGE)));
                    frame.update(trapezio.getGraphics());
                }

                case 2 -> {
                    trapezio.setAltura(Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                                    "Digite uma nova altura",
                                    "Alterar altura",
                                    JOptionPane.PLAIN_MESSAGE)));
                    frame.update(trapezio.getGraphics());
                }
            }
        } while (op!=SAIR && op!=-1);

    }
    static private JFrame initFrame() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }
}
