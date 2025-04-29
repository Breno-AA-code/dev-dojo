package academy.devdojo.maratonajava.introducao;

public class Aula6ex2 {
    public static void main(String[] args) {
        double carValue = 50000.03;
        
        for (int parcela = 1; parcela < carValue; parcela++) {
            if (carValue / parcela < 1000) {
                break;
            }
            System.out.println("É possível parcelar em "+ parcela + " vezes");
            System.out.println("Valor da parcela é de: " + carValue / parcela);
        }
    }
}