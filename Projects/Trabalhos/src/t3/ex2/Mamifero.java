package t3.ex2;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    @Override
    public void relatorio() {
        super.relatorio();
        System.out.println("Alimentação: "+alimento);
    }

}
