package listaEncapsulamento;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    public static void main(String[] args) {
        Cachorro golden = new Cachorro();
        golden.emitirSom();
        golden.abanarRabo();
    }
}