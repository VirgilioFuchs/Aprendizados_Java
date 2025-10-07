package org.example;

//Solicite ao usuário as notas de um aluno (entre 0 e 10).
//Valide se cada nota é válida (não aceitar valores fora desse intervalo). OK
//Calcule a média e informe se o aluno foi Aprovado, Recuperação ou Reprovado. OK
//Permita repetir o processo para vários alunos até o usuário digitar “sair”.

import java.util.Objects;
import java.util.Scanner;

public class NotasAlunos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = null;
        String resposta = null;
        double nota = 0.0;
        int materias = 0;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        double notas = 0.0;

        do {
            nota = validarNota("Digite sua nota: (Ex: 10.0)");
            notas += nota;
            materias++;
            System.out.println("Deseja continuar ou sair? Digite 'sair' se quiser sair");
            resposta = entrada.nextLine();
        } while (!Objects.equals(resposta, "sair"));

        System.out.println(resultadoMedia(notas, materias, nome));
    }

    public static double validarNota(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String input = entrada.nextLine();

            double resultado = Double.parseDouble(input);
            if (resultado >= 0 && resultado <= 10) {
                return resultado;
            } else {
                System.out.println("Digite uma nota valida");
            }
        }
    }

    public static String resultadoMedia(double nota, int materias, String nome) {
        double resultado = nota / materias;
        String resultadoFinal = resultado >= 7.0 ? " foi aprovado" : " foi reprovado";
        return String.format("%s vc %s com %.1f de nota", nome, resultadoFinal, resultado);
    }
}