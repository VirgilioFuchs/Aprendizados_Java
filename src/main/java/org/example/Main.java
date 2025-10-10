package org.example;

import java.util.Arrays;
import java.util.List;

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
        popular.setConsumoPorLitro(18.5);

        CarroHibrido hibrido = new CarroHibrido();
        hibrido.setMarca("Toyota");
        hibrido.setModelo("Rav 4");
        hibrido.setAno(2022);
        hibrido.setPreco(350000.00);
        hibrido.setConsumoPorLitro(35.0);
        hibrido.setAutonomiaEletrica(55);
        hibrido.setConsumoPorLitro(35.0);
        hibrido.setAutonomiaEletrica(55.0);

        List<Carro> carros = Arrays.asList(esportivo,popular,hibrido);

        for (Carro c: carros) {
            System.out.println("------- Carro -------");
            System.out.println(c);
            System.out.println();
        }
    }
}