public class Triangulo extends Figura {
    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    double base;
    double altura;
}
