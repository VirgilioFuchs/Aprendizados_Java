package org.example;

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }

    public void setAno(int Ano) { this.ano = Ano; }

    public double getPreco() { return preco; }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }

    }

    @Override
    public String toString() {
        return String.format("Marca: %s%nModelo: %s%nAno: %d%nPreco: R$ %.2f%n",
                getMarca(), getModelo(), getAno(), getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Chevrolet");
        carro1.setModelo("Corvette");
        carro1.setAno(2025);
        carro1.setPreco(1000000.00);

        carro2.setMarca("Ferrari");
        carro2.setModelo("La Ferrari");
        carro2.setAno(2020);
        carro2.setPreco(-5000000.00);

        System.out.println(carro1);
        System.out.println("------------------");
        System.out.println(carro2);
    }
}