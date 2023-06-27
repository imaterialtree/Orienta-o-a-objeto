/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.awt.*;

/**
 *
 * @author naoki
 */
public class Trapezio extends Component {
    private int baseMenor, baseMaior, altura;
    private int strokeWidth = 2;

    public Trapezio() {
    }

    public Trapezio(int baseMenor, int baseMaior, int altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int calcularArea() {
        return (baseMaior+baseMenor)*altura/2;
    }

    @Override
    public String toString() {
        return "Trapezio{" +
                "baseMenor=" + baseMenor +
                ", baseMaior=" + baseMaior +
                ", altura=" + altura +
                '}';
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // draw GeneralPath (polygon)
        g2.setStroke(new BasicStroke(strokeWidth));

        int h = this.getParent().getHeight();
        int w = this.getParent().getWidth();

        Polygon polygon = new Polygon();
        polygon.addPoint(w/2-(baseMenor/2), h/2-(altura/2));
        polygon.addPoint(w/2+(baseMenor/2), h/2-(altura/2));
        polygon.addPoint(w/2+(baseMaior/2), h/2+(altura/2));
        polygon.addPoint(w/2-(baseMaior/2), h/2+(altura/2));
        g2.draw(polygon);
    }
}
