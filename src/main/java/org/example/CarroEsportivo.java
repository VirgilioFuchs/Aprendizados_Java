package org.example;

public class CarroEsportivo extends Carro {
    public CarroEsportivo(String modelo, int ano, String cor, String motor){
        super(modelo, ano, cor, motor);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro esportivo!");
    }

    @Override
    public void frear() {
        System.out.println("Freando o " + getModelo() + " ate parar!");
    }

    @Override
    public void tipoMotor() {
        System.out.println("Motor " + getMotor() +" esta em acao!" );
    }
}