package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;
// até 34.712 = 9.7%; de 34.713 até 68.507 = 37.55%; 68.508+ = 49;5%; 

import java.util.Scanner;

public class ExercicioAula4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
         
        
        System.out.println("Digite o seu salário:");
        double devSalary = scanner.nextDouble();

        double firstBracket = 34712 * 9.7/100;

        double secondBracket = 33794 * 37.55/100;
        
        double tax;

        if (devSalary <= 34712) {
           tax = devSalary * 9.7/100;
        } else if (devSalary >= 68508) {
            tax = firstBracket + secondBracket + (devSalary - 68507)*49.5/100;
        } else {
            tax = firstBracket + (devSalary - 34712)*37.55/100;
        }
        
        

        System.out.println("O valor de imposto a ser pago é de: "+df.format(tax));
        scanner.close();
    }
}
