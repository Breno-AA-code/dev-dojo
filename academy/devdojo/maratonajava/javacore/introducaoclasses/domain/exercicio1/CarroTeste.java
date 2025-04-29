package academy.devdojo.maratonajava.javacore.introducaoclasses.domain.exercicio1;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2025;
        carro1.nome = "Carro do liso";
        carro1.modelo = "BMW X3M";

        
        carro2.ano = 2025;
        carro2.nome = "Carro do batima";
        carro2.modelo = "BMW X6M competition";

        System.out.println("carro 1\n" +carro1.ano + "\n" + carro1.modelo + "\n" + carro1.nome);
        System.out.println("carro 2\n" +carro2.ano + "\n" + carro2.modelo + "\n" + carro2.nome);
    }
}