package academy.devdojo.maratonajava.javacoreb.domain;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        int a = 901;
        int b = 60;
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(a, b);
        calculadora.subtraiDoisNumeros(a, b);
        calculadora.multiplicaDoisNumeros(31, 31);
        System.out.println(calculadora.divideDoisNumeros(15.5, 0));
        calculadora.divideDoisNumeros3(a,0);
    }
}
