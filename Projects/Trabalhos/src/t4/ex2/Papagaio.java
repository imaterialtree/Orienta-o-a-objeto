/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex2;

/**
 *
 * @author naoki
 */
public class Papagaio extends Ave{

    public Papagaio(String nome) {
        super(nome);
    }
    
    @Override
    public String voar(){
        return "papagaio voa";
    } 

    @Override
    public String emitirSom() {
        return "Imita todo mundo";
    }
    
}
