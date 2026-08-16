public class Controle {
    public static void main (String[] args){
        Operacao operacao = new Soma();
        System.out.println(operacao.calculo(10, 5));
        operacao = new Subtracao();
        System.out.println(operacao.calculo(10, 5));
        operacao = new Multiplicacao();
        System.out.println(operacao.calculo(10, 5));
        operacao = new Divisao();
        System.out.println(operacao.calculo(10, 5));
    }
}
