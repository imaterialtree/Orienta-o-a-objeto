/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex2;

/**
 *
 * @author naoki
 */
public class Gato extends Mamifero{
    
    String raca;

    public Gato(String raca, String nome) {
        super(nome);
        this.raca = raca;
    }
    
    @Override
    public String amamentar() {
        return "tetinha da gata";
    }

    @Override
    public String emitirSom() {
        return "miau";
    }
    
}
