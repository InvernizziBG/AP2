// Main.java
public class Main {
    public static void main(String[] args) {
        // Instanciação de um carro
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        // Instanciação de uma moto
        Moto moto = new Moto("Honda", "CB500", 2019, 500);

        // Impressão das informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
