package formasGeometricas;

public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Area do retangulo: " +area);
    }
}
