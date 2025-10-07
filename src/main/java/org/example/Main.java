package org.example;

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println(imprimir(nome,idade));
        entrada.close();
    }

    public static String imprimir(String nome, int idade) {
        String status = idade > 17 ? "Maior de idade" : "Menor de idade";
        return String.format("Nome: %s | Idade: %d%n%s", nome, idade, status);
    }
}