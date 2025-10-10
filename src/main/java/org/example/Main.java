package org.example;

public class Main {
    public static void main(String[] args) {
        CarroEsportivo esportivo = new CarroEsportivo();
        esportivo.setMarca("BMW");
        esportivo.setModelo("320i");
        esportivo.setAno(2025);
        esportivo.setPreco(600000.00);
        esportivo.setVelocidadeMaxima(320.0);

        CarroPopular popular = new CarroPopular();
        popular.setMarca("Volkswagen");
        popular.setModelo("Gol G5");
        popular.setAno(2020);
        popular.setPreco(50000.00);
        popular.setConsumoPorLitro(18.5);

        CarroHibrido hibrido = new CarroHibrido();
        hibrido.setMarca("Toyota");
        hibrido.setModelo("Rav 4");
        hibrido.setAno(2022);
        hibrido.setPreco(350000.00);
        hibrido.setConsumoPorLitro(35.0);
        hibrido.setAutonomiaEletrica(55);

        System.out.println("\n-------- Carro Esportivo --------");
        System.out.println(esportivo);
        System.out.println("\n-------- Carro Popular --------");
        System.out.println(popular);
        System.out.println("\n-------- Carro Hibrido --------");
        System.out.println(hibrido);
    }
}