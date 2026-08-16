public class Controle {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.base = 10;
                retangulo.altura = 5;
        System.out.println (retangulo.calcularArea());
        Triangulo triangulo = new Triangulo();
        triangulo.base = 10;
                triangulo.altura = 6;
        System.out.println (triangulo.calcularArea());
    }
}
