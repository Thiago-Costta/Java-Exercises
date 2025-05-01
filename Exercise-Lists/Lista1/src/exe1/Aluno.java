package exe1;

import javax.swing.*;

public class Aluno {
    public int numeroAluno, idade;
    public String nomeAluno;
    public float p1, p2, Media;

    public Aluno(){
        this.nomeAluno = "Sem nome";
    }
    public Aluno(int numeroAluno, String nomeAluno, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String passou(){
        return (this.notaFinal() >= 6) ? "Aprovado" : "Não Aprovado";
    }
    public void exibirDetalhes(){
        System.out.println(
                "Nota Final: " + this.Media);
    }
}
