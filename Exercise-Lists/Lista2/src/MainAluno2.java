import exe7.Aluno;
public class MainAluno2 {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(0, 21, "Thiago", 9, 5);
        System.out.println(obj1.exibeAluno());
        Aluno obj2 = new Aluno();

        obj2.setNome("Bruno");
        obj2.setIdade(29);
        obj2.setNroAluno(1);
        obj2.setP1(4);
        obj2.setP2(8);
        System.out.println(obj2.exibeAluno());
        System.out.println(obj2.notaFinal());


    }
}
