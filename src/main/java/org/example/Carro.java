package org.example;

public abstract class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private String motor;

    public Carro(String modelo, int ano, String cor, String motor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getMotor() {
        return motor;
    }

    public void exibirInfo() {
        System.out.println(String.format("Modelo: %s%nCor: %s%nAno: %d", getModelo(), getCor(), getAno()));
    }

    public abstract void acelerar();

    public abstract void frear();

    public abstract void tipoMotor();
}