package org.example;

public class CarroHibrido extends Carro {
    private double consumoPorLitro;
    private double autonomiaEletrica;
    
    public  double getConsumoPorLitro() { return consumoPorLitro; }
    
    public void setConsumoPorLitro(double consumoPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
    }

    public  double getAutonomiaEletrica() { return autonomiaEletrica; }

    public void setAutonomiaEletrica(double autonomiaEletrica) {
        this.autonomiaEletrica = autonomiaEletrica;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Consumo por litro e: %.1f km/l%n", getConsumoPorLitro())  +
                String.format("Autonomia eletrica e: %.1f km", getAutonomiaEletrica());
    }
}
