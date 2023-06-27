package t3.ex2;

public class Animal {
    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;

    public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }
    public void relatorio() {
        System.out.println("-----RELATORIO------");
        String className = this.getClass().getSimpleName();
        String msg = String.format(
            "Nome: %s\n" +
            "Tipo: %s\n" +
            "Comprimento: %.2f\n" +
            "Numero de patas: %d\n" +
            "Cor: %s\n" +
            "Ambiente: %s\n" +
            "Velocidade média: %.2fkm/h",
            nome, className, comprimento, numPatas, cor, ambiente, velocidadeMedia
        );
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numPatas=" + numPatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMedia=" + velocidadeMedia +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
