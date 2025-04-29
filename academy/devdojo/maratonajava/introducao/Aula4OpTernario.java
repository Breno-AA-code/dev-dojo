package academy.devdojo.maratonajava.introducao;

public class Aula4OpTernario {
    public static void main(String[] args) {
        double salary = 6000;
        String doar = "eu vou doar 500 pro dev dojo";
        String naoDoar = "Eu ainda nao tenho condições";
        String resultado = salary > 5000 ? doar : naoDoar;
        System.out.println(resultado);
    }
}


/*
    Operador ternário é dividido em 3 partes, a primeira é condição
String opTernario = condição ? verdadeiro : falso;
note que o operador ternário poderia ser utilizado diretamente no System.out.println
porém não é recomendado pois pode gerar muita confusão no código.
o operador ternário é ÓTIMO para substituir if else simples.*/