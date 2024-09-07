package listaEncapsulamento;

public class SomaNumeros {
    public static void main(String[] args) {
        System.out.println("Soma de dois numeros inteiros: " +somaNumeros(1, 4));
        System.out.println("Soma de dois numeros decimais: " +somaNumeros(2.5, 2.5));
        System.out.println("Soma de um numero decimal e um inteiro: " +somaNumeros(2.5, 1));
        System.out.println("Soma de um numero inteiro e um decimal: " +somaNumeros(2, 1.5));
    }

    private static double somaNumeros(int a, int b) {
        return a + b;
    }

    private static double somaNumeros(double a, double b) {
        return a + b;
    }

    private static double somaNumeros(double a, int b) {
        return a + b;
    }

    private static double somaNumeros(int a, double b) {
        return a + b;
    }
}
