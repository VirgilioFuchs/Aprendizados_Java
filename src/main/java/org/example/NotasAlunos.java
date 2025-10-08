package org.example;

//Solicite ao usuário as notas de um aluno (entre 0 e 10). OK
//Valide se cada nota é válida (não aceitar valores fora desse intervalo). OK
//Calcule a média e informe se o aluno foi Aprovado, Recuperação ou Reprovado. OK
//Permita repetir o processo para vários alunos até o usuário digitar “sair”. OK

import java.util.Objects;
import java.util.Scanner;

public class NotasAlunos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = null;
        String resposta = null;
        double nota1 = 0.0;
        double nota2 = 0.0;
        double nota3 = 0.0;

        do {
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();

            nota1 = validarNota("Digite sua nota 1: (Ex: 10.0)");
            nota2 = validarNota("Digite sua nota 2: (Ex: 10.0)");
            nota3 = validarNota("Digite sua nota 3: (Ex: 10.0)");

            System.out.println(resultadoMedia(nota1, nota2, nota3, nome));
            System.out.println("Deseja continuar ou sair? Digite 'sair' se quiser sair");
            resposta = entrada.nextLine();
            System.out.println("------------------------------");

        } while (!resposta.equalsIgnoreCase("sair"));

        System.out.println("Saindo!!");
        entrada.close();
    }

    public static double validarNota(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String input = entrada.nextLine();

            try {
                double resultado = Double.parseDouble(input);
                if (resultado >= 0 && resultado <= 10) {
                    return resultado;
                } else {
                    System.out.println("Digite uma nota valida de 0 a 10");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma nota valida em número");
            }
        }
    }

    public static String resultadoMedia(double nota1, double nota2, double nota3, String nome) {
        String resultadoFinal = null;
        double resultado = (nota1 + nota2 + nota3) / 3.0;

        if (resultado >= 7) {
            resultadoFinal = "foi aprovado";
        } else if (resultado >= 5) {
            resultadoFinal = "esta de recuperacao";
        } else {
            resultadoFinal = "foi reprovado";
        }
        return String.format("%s vc %s com %.1f de nota", nome, resultadoFinal, resultado);
    }
}