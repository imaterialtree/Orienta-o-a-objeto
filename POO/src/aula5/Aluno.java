package aula5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private Map<String, Integer> disciplinas;

    public Aluno(String nome, String matricula, String curso, List<String> disciplinas, List<Integer> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = IntStream.range(0, disciplinas.size()).boxed()
                .collect(Collectors.toMap(disciplinas::get, notas::get));
    }

    public Map<String, Integer> getDisciplinas() {
        return disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public boolean isAprovado(String disciplina) {
        return disciplinas.get(disciplina) >= 7;
    }
}
