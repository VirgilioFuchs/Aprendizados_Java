package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarroEsportivo esportivo = new CarroEsportivo("Huayra R Evo", 2024, "preto", "V12 aspirado");
        CarroPopular popular = new CarroPopular("Classic", 2011, "cinza-chumbo", "L4");

        List<Carro> carros = List.of(esportivo, popular);

        for (Carro carro: carros) {
            System.out.println("\n--------- Carro ---------");
            carro.exibirInfo();
            carro.tipoMotor();
            carro.acelerar();
            carro.frear();
        }
    }
}