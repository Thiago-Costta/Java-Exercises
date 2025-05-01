package exe2;

public class Cliente {
    public int nmrAgencia, nmrConta;
    public String nome;
    public float saldo;
    public Cliente() {
        this.nome = "Sem nome";
    }
    // Metodo Construtor como parametro
    public Cliente(int nmrAgencia, int nmrConta, String nome, float saldo) {
        this.nmrAgencia = nmrAgencia;
        this.nmrConta = nmrConta;
        this.nome = nome;
        this.saldo = saldo;

    }
    public void depositar(float x){
        this.saldo += x;
        System.out.println("Deposito realizado com sucesso!\nValor: " + x);
    }

    public void exibirDetalhes() {
        System.out.println("Nro. Conta: " + nmrConta + " Nome: " + nome + " Saldo: " + saldo);
    }

    public void sacar(float x){
        if (this.saldo >= x){
            this.saldo -= x;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
}
