/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex2;

/**
 *
 * @author naoki
 */
abstract public class Animal {
    String nome;
    abstract public String emitirSom();

    public Animal(String nome) {
        this.nome = nome;
    }
}
