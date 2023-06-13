package AULA;

import java.util.Scanner;

public class Atividade_2 {

    public static void main(String[] args) {

        // Criando a matriz para armazenar as médias das turmas
        String[] aluno = new String[40];
        String[] turma = new String[4];

        Scanner input = new Scanner(System.in);

        // Leitura das médias de cada aluno de cada turma
        for (int i = 0; i < 4; i++) {
            System.out.println("Turma " + (i + 1) + ":");
            for (int j = 0; j < 40; j++) {
                System.out.print("Digite a nota do aluno " + (j + 1) + ": ");
                turma[i] = input.nextLine();
                aluno[j] = input.nextLine();
            }
        }

        // Cálculo da média de cada turma
        double[] medias = new double[4];
        for (int i = 0; i < 4; i++) {
            double soma = 0;
            for (int j = 0; j < 40; j++) {
                soma += mediasTurmas[i][j];
            }
            medias[i] = soma / 40;
        }

        // Impressão das médias de cada turma
        for (int i = 0; i < 4; i++) {
            System.out.println("Média da turma " + (i + 1) + ": " + medias[i]);
        }

        // Identificação e impressão da melhor nota de cada turma
        for (int i = 0; i < 4; i++) {
            double melhorNota = 0;
            int numAluno = 0;
            for (int j = 0; j < 40; j++) {
                if (mediasTurmas[i][j] > melhorNota) {
                    melhorNota = mediasTurmas[i][j];
                    numAluno = j + 1;
                }
            }
            System.out.println("Melhor nota da turma " + (i + 1) + ": " + melhorNota + " (Aluno " + numAluno + ")");
        }
    }
}
