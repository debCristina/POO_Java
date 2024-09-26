package formasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(2.0));
        formas.add(new Retangulo(4, 2));
        formas.add(new Triangulo(2, 4));

        for(Forma forma: formas ) {
            forma.calcularArea();
        }
    }
}
