package AULA;

import javax.swing.JOptionPane;

public class alunosturma {
    public static void main(String[] args) {
        String nomeAlunosNotas[][] = new String[4][40];
        float[][] notas = new float[4][40];
        float[] medias = new float[4];
        float[] melhores = new float[4];
        int[] melhorAluno = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                nomeAlunosNotas[i][j] = JOptionPane
                        .showInputDialog("Digite o nome do aluno " + (j + 1) + " da turma " + (i + 1) + ": ");
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                notas[i][j] = Float.parseFloat(JOptionPane
                        .showInputDialog(
                                "Digite a nota do aluno " + nomeAlunosNotas[i][j] + " da turma " + (i + 1) + ": "));
            }
        }
        System.out.println(notas[1][2]);

    }
}
