/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex1;

/**
 *
 * @author naoki
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario jose = new Analista("José da Silva", 10000);
        Funcionario pedro = new Programador("Pedro Antônio Cabral", 7000);
        
        System.out.println("Antes do reajuste:");
        System.out.println(jose);
        System.out.println(pedro);
        
        jose.reajustar();
        pedro.reajustar();
        
        System.out.println("\nDepois do reajuste:");
        System.out.println(jose);
        System.out.println(pedro);
        
        
    }
}
