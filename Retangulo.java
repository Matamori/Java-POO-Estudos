public class Retangulo extends Figura {
    @Override
    public double calcularArea() {
        return base * altura;
    }

    double base;
    double altura;
}
