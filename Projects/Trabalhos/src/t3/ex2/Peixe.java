package t3.ex2;

public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Característica: "+caracteristica);
    }
}
