package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        String name = "Breno";
        double salary = 2000.5;
        String addres = "Altiplano";
        String payDay = "18/03/25";
        String payCheck = "Eu " + name + ", morando no endereço " + addres + ", confirmo que recebi o salário de " + salary + ", na data " + payDay + "."; 
        System.out.println(payCheck);
    }
}
