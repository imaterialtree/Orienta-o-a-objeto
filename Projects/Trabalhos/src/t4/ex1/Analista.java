/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex1;

/**
 *
 * @author naoki
 */
public class Analista extends Funcionario{

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void reajustar() {
        salario += 2000;
    }
    
}
