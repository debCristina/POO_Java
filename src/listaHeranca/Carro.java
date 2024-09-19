package _19_09_2024.listaHeranca;

public class Carro extends Veiculo{
    private int portas;

    public void abrirPortaMalas() {
        System.out.println("Abrindo porta malas");
    }

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " +portas);
    }
}
