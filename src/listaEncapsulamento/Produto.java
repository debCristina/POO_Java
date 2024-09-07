package listaEncapsulamento;

public class Produto {
    public static void main(String[] args) {
        exibeInformacoes("Playstation 5", "ABC23454");

        exibeInformacoes("Playstation 5", 3.500);

        exibeInformacoes("Playstation 5", "ABC23454", 3.500);

    }

    private static void exibeInformacoes(String nome, String codigo) {
        System.out.println("Produto: " +nome+ "\nCodigo: " +codigo);
    }

    private static void exibeInformacoes(String nome, Double valor) {
        System.out.println("Produto: " +nome+ "\nValor: " +valor);
    }

    private static void exibeInformacoes(String nome, String codigo, Double valor) {
        System.out.println("Produto: " +nome+ "\nCodigo: " +codigo+ "\nValor: " +valor);
    }
}
