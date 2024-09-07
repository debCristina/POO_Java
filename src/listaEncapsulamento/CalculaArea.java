package listaEncapsulamento;

public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Area do quadrado : " +calculaArea(5));
        System.out.println("Area retâgulo :" +calculaArea(7, 3));
        System.out.println("Area circulo: " +calculaArea(3.5, true));

    }
    private static double calculaArea (double lado) {
        return lado * lado;
    }

    private static double calculaArea (double base, double altura) {
        return base * altura;
    }

    private static double calculaArea (double raio, boolean isCirulo) {
        return Math.PI * Math.pow(raio, 2);
    }

}
