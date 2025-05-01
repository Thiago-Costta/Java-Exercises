package exe3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    //Criar um objeto produto sem valores
    public Produto(){
        this.descricao = "Sem Descrição";
    }

    //criar um objeto produto com valores
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Comprar X unidades
    public void comprar(int x){
        this.qtde = this.qtde+x;
    }

    //Vende X unidades
    public void vender(int x){
        if (this.qtde>=x){
            this.qtde -=x;
        }
        else{
            System.out.println("Estoque insuficiente");
        }
    }

    //Subir preço em X unidades
    public void subir(float x){
        this.preco += x;
    }

    //Descer preco em X unidades
    public void descer(float x){
        if(this.preco >= x){
            this.preco -= x;
        }
        else{
            System.out.println("Valor do desconto maior que o atual");
        }
    }

    public void exibeDetalhes() {
        System.out.println(
                "Produto: Id = " + id +
                ", Qtde = " + qtde +
                ", Descrição = " + descricao +
                ", Preço = " + preco
        );
    }
}
