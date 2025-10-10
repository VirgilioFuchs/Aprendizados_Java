package org.example;

public class CarroEsportivo extends Carro {
    private double velocidadeMaxima;
    
    public  double getVelocidadeMaxima() { return velocidadeMaxima; }
    
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Velocidade Maxima: %.1f km/h", getVelocidadeMaxima());
    }
}
