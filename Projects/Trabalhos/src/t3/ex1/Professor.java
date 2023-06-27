package t3.ex1;

public class Professor extends Pessoa{
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor(String nome, String endereco, String telefone, String cpf, String departamento, String nomeCurso, double salario) {
        super(nome, endereco, telefone, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public Professor(Pessoa p, String departamento, String nomeCurso, double salario) {
        super(p.nome, p.endereco, p.telefone, p.cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public double calcularSalarioLiquido(double taxa) {
        return salario * (1-taxa);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
