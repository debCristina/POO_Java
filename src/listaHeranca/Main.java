package _19_09_2024.listaHeranca;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda", "Civic", 2016, 4);
        carro1.exibirInformacoes();
        carro1.abrirPortaMalas();
        carro1.acelerar();

        System.out.println();

        Moto moto1 = new Moto("Honda", "Pop- 100", 2010, true);
        moto1.exibirInformacoes();
        moto1.empinar();

    }
}
