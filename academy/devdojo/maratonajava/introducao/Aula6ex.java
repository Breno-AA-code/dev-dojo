package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;


public class Aula6ex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor final da contagem: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
