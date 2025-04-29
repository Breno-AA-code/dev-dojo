package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = 10000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioDouble+idadeByte+salarioFloat+idadeShort+caractere);
        System.out.println(verdadeiro);
        System.out.println(falso);
    }
}