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
