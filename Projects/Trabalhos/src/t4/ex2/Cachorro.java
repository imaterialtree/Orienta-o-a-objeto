/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex2;

/**
 *
 * @author naoki
 */
public class Cachorro extends Mamifero{
    public String raça;
    public String tamanho;

    public Cachorro(String raça, String tamanho, String nome) {
        super(nome);
        this.raça = raça;
        this.tamanho = tamanho;
    }

    @Override
    public String amamentar() {
        return "Da tetinha da cadela";
    }

    @Override
    public String emitirSom() {
            return "AU AU";
    }
    
    
}
