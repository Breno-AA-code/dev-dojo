package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor que deseja comparar:");
        int firstValue = scanner.nextInt();

        System.out.println("Digite o segundo valor que deseja comparar");
        int secondValue = scanner.nextInt();

        if (firstValue > secondValue) {
            System.out.println("O primeiro valor é maior do que o segundo");
        } else if (firstValue == secondValue) {
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println("O segundo valor é maior do que o primeiro.");
        } 

        scanner.close();
    }

}
