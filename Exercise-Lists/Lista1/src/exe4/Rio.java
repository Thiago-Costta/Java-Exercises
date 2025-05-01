package exe4;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {
        this.nome = "Sem nome";
    }

    public Rio(String nome, int nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(int x){
        this.nivel += x;
    }

    public void ensolarar(int x){
        if(this.nivel >= x){
            this.nivel -= x;
        }
        else{
            System.out.println("Nível do rio não pode ser negativo");
        }
    }

    public void limpar(){
        if(this.poluido){
            this.poluido = false;
        }
        else{
            System.out.println("Rio já está limpo");
        }
    }

    public void sujar(){
        if(!this.poluido){
            this.poluido = true;
        }
        else{
            System.out.println("Rio já está poluido");
        }
    }


    public void mostrarDetalhes() {
        System.out.println( "Rio: " +
                " nome = " + nome +
                ", nivel = " + nivel +
                ", poluido = " + poluido
        );
    }
}
