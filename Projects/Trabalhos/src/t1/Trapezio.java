/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1;

/**
 *
 * @author naoki
 */
public class Trapezio {
    private Double baseMenor;
    private Double baseMaior;
    private Double altura;

    public Trapezio() {
    }

    public Trapezio(Double baseMenor, Double baseMaior, Double altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public Double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(Double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double calcularArea() {
        Double area = (baseMaior+baseMenor)*altura/2;
        return area;
    }

    @Override
    public String toString() {
        return "Trapezio{" + "baseMenor=" + baseMenor + ", baseMaior=" + baseMaior + ", altura=" + altura + '}';
    }
    
    public void printTrapezio() {
        System.out.println(this.toString());
    }
}
