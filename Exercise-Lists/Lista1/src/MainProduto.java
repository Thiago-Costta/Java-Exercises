import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        //Chamar construtor sem parâmetro
        Produto obj1 = new Produto();

        //Chama costrutor com parâmetro
        Produto obj2 = new Produto(123, 5, "Bola de Futebol", 50.0f);
        obj1.exibeDetalhes();
        obj2.exibeDetalhes();
        obj2.comprar(3);
        obj2.vender(1);
        obj2.subir(500.0f);
        obj2.descer(250.0f);
        obj2.exibeDetalhes();

    }
}
