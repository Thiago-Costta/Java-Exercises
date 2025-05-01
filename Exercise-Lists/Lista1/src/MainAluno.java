import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        System.out.println("Nome:" + obj1.nomeAluno + ", Média:" + obj1.notaFinal() + ", Aluno:" + obj1.passou());
        obj1.passou();

        Aluno obj2 = new Aluno(25391, "João", 19, 7.0f, 8.0f);
        System.out.println("Nome:" + obj2.nomeAluno + ", Média:" + obj2.notaFinal() + ", Aluno:" + obj2.passou());
    }
}