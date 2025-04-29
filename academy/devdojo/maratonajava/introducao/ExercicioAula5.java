package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExercicioAula5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana de 1 a 7, sendo 1 domingo e 7 sábado.");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("é domingo, fim de semana");
                break;
            
            case 2:
                System.out.println("é segunda, dia útil.");
                break;
            
            case 3:
                System.out.println("é terça, dia útil.");
                break;

            case 4:
                System.out.println("é quarta, dia útil.");
                break;

            case 5:
                System.out.println("é quinta, dia útil.");
                break;

            case 6:
                System.out.println("é sexta, dia útil.");
                break;

            case 7:
                System.out.println("é sábado, fim de semana.");
                break;
                
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
}
