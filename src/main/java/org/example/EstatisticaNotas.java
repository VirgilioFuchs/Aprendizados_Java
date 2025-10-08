package org.example;

import java.util.Scanner;

public class EstatisticaNotas {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdAlunos = 0;
        double notas = 0.0;
        double nota = 0;
        double notaMaior = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;

        qtdAlunos = validarQtde("Quantos alunos tem na sala?");

        for (int i = 1; i <= qtdAlunos; i++ ) {
            nota = validarNota(String.format("Digite a nota do aluno %d (0 a 10): ", i));

            if (nota > notaMaior) {
                notaMaior = nota;
            }

            if (nota < notaMenor) {
                notaMenor = nota;
            }

            notas += nota;
        }

        double media = resultadoMedia(qtdAlunos, notas);
        System.out.println("------------------------------");
        System.out.printf("A media da sala e %.1f%n", media);
        System.out.printf("A maior nota da sala e %.1f%n", notaMaior);
        System.out.printf("A menor nota da sala e %.1f", notaMenor);

        entrada.close();
    }

    public static double validarNota(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String nota = entrada.nextLine();
            try {
                double resultado = Double.parseDouble(nota);
                if (resultado >= 0 && resultado <= 10) {
                    return resultado;
                } else {
                    System.out.println("Digite uma nota valida de 0 a 10!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma nota valida em numero");
            }
        }
    }

    public static int validarQtde(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String qtde = entrada.nextLine();
            try {
                int resultado = Integer.parseInt(qtde);
                if (resultado > 0) {
                    return resultado;
                } else {
                    System.out.println("Digite um numero maior que 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma nota valida em numero");
            }
        }
    }

    public static Double resultadoMedia(int qtdeAlunos, double notas) {
        return notas / qtdeAlunos;
    }
}
