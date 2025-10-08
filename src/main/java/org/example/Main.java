package org.example;

class Carro {
    String marca;
    String modelo;
    int ano;
    double preco;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s %nModelo: %s %nAno: %d %nPreco: %.2f", marca, modelo, ano,preco);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mitsubishi", "Lancer Evo 5", 2015, 50000.00);
        Carro carro2 = new Carro("BMW", "M3 GTR", 2001, 500000.00);
        System.out.println(carro1);
        System.out.println("-----------------------");
        System.out.println(carro2);
    }
}