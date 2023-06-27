package t3.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Aluno extends Pessoa{
    private HashMap<String, List<Double>> cursoNotas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String[] cursos, Double[][] notas) {
        super(nome, endereco, telefone, cpf);
        cursoNotas = new HashMap<>();
        for (int i = 0; i < cursos.length; i++) {
            cursoNotas.put(cursos[i], Arrays.asList(notas[i]));
        }
    }

    public Aluno(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        cursoNotas = new HashMap<>();
    }

    public String[] getCursos() {
        return cursoNotas.keySet().toArray(String[]::new);
    }
    public Double[][] getAllNotas() {
        List<List<Double>> notaList = cursoNotas.values().stream().toList();
        Double[][] notasArr = new Double[notaList.size()][];
        for (int i = 0; i < notaList.size(); i++) {
            notasArr[i] = notaList.get(i).toArray(Double[]::new);
        }
        return notasArr;
    }

    public Double[] getNotas(String curso) {
        return cursoNotas.get(curso).toArray(Double[]::new);
    }

    public void addCurso(String curso, List<Double> notas) {
        cursoNotas.put(curso, notas);
    }
    public void addCurso(String curso) {
        cursoNotas.put(curso, new ArrayList<>());
    }
    public double calcularMedia(String curso) {
        return cursoNotas.get(curso).stream().mapToDouble(Double::doubleValue).average().orElse(0);

    }

    public double calcularMediaGeral() {
        double media = 0;
        for (String curso: getCursos()) {
            media += calcularMedia(curso);
        }
        return media;
    }

    public boolean verificarAprovado(String curso) {
        return calcularMedia(curso) >= 6;
    }
}
