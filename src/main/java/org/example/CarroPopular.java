package org.example;

public class CarroPopular extends Carro {
    private double consumoPorLitro;
    
    public  double getConsumoPorLitro() { return consumoPorLitro; }
    
    public void setConsumoPorLitro(double consumoPorLitro) {

        this.consumoPorLitro = consumoPorLitro;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Consumo por litro e: %.1f km/l", getConsumoPorLitro());
    }
}
