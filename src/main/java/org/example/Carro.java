package org.example;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() { return ano; }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preco invalido!");
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