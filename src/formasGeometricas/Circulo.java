package formasGeometricas;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * (raio * raio);
        System.out.println("Area do circulo: " +area);
    }
}
