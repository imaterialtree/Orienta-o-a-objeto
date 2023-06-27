/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.ex1;

/**
 *
 * @author naoki
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    abstract public void reajustar();
    
    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        String display = 
                "------------------------\n"+
                "Nome: %s\n"+
                "Cargo: %s\n"+
                "Salario US$%,.2f";
        return  String.format(display, nome, className, salario);
    }    
}
