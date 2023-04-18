package aula5;

public class Lampada {
    private String marca;
    private String modelo; // Modelo de fábrica
    private String tipo; // LED, FLUORESCENTE, INCANDESCENTE
    private double watts;
    private double tensao;
    private boolean isOn;

    public Lampada(String marca, String modelo, String tipo, double watts, double tensao) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.watts = watts;
        this.tensao = tensao;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public void switchOnOff() {
        isOn = !isOn;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public double getTensao() {
        return tensao;
    }

    public void setTensao(double tensao) {
        this.tensao = tensao;
    }
}
