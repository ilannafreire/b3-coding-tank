package exercicios;

import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o número de alunos: ");
        int numeroAlunos = entrada.nextInt();

        double[] notas = new double[numeroAlunos];
        String[] nomes = new String[numeroAlunos];


        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.next();
        }


        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / numeroAlunos;


        System.out.println("\nNotas dos Alunos:");
        for (int i = 0; i < numeroAlunos; i++) {

            System.out.print(nomes[i] + ": ");

            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("\nMédia da Turma: " + media);
        System.out.println("Quantidade de Alunos: " + numeroAlunos);


        System.out.println("\nPrograma finalizado.");
        entrada.close();
    }
}



/*

Calcular a média de notas de uma turma com n alunos.
O valor n deve ser solicitado para o usuário.
Ao final o programa deve imprimir a nota de todos os alunos e também a média e quantidade de alunos.

 */