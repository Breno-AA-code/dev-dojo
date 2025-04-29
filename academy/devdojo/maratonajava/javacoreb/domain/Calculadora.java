
package academy.devdojo.maratonajava.javacoreb.domain;

public class Calculadora {
    
    public void somaDoisNumeros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println(soma);
    }

    public void subtraiDoisNumeros(int num1, int num2){
        int subtrai = num1 - num2;
        System.out.println(subtrai);
    }

    public void multiplicaDoisNumeros (int num1, int num2){
        int multiplicacao = num1 * num2;
        System.out.println(multiplicacao);
    }
    //NOTE: O RETORNO NÃO EXISTE, NÃO PODEMOS CHAMAR ELE EM UM SOUT, POR EXAMPLO.

    public double divideDoisNumeros (double num1, double num2){
        if(num2 == 0){
        return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2 (double num1, double num2){
        if(num2 != 0){
        return num1 / num2;
        }
        return 0;
    }

        // O RETURN PARA O CÓDIGO.
        // PODEMOS USAR O RETURN EM MÉTODOS VOID TAMBÉM, UTILIZAMOS RETURN; PARA QUEBRAR UM CÓDIGO.
        // EXEMPLO:

    public void divideDoisNumeros3 (double num1, double num2){
        if(num2 == 0){
        return;
        }
        System.out.println(num1 / num2);
    }

}

