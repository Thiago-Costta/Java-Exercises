public class Main {
    public static void main(String[] args) {
        Pintura p = new Pintura("Picasso", "Dom Quixote", "técnica A");
        Escultura e = new Escultura("óleo", "Teto da Capela Sistina", "Michelangelo");

        Exposicao exp = new Exposicao("Dia do artista");
        exp.addObra(p);
        exp.addObra(e);
        System.out.println(exp.resumo());

    }
}