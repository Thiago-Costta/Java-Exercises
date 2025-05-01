import exe4.Rio;
public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio();

        Rio obj2 = new Rio("tiete",7000, false);
        obj1.mostrarDetalhes();
        obj2.mostrarDetalhes();
        obj2.chover(3000);
        obj2.ensolarar(6000);
        obj2.limpar();
        obj2.sujar();
        obj2.mostrarDetalhes();

    };

};
