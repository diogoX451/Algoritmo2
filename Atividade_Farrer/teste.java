package Atividade_Farrer;

import java.util.Scanner;

class Farrer2_5_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[20][50];
        int m, n;

        System.out.println("Informe a quantidade de linhas desejadas: ");
        m = sc.nextInt();

        System.out.println("Informe a quantidade de colunas desejadas: ");
        n = sc.nextInt();

        System.out.println("Informe os dados da tabela A (" + m + " x " + n + ")");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Informe o número da " + (i + 1) + "ª linha, " + (j + 1) + "ª coluna: ");
                a[i][j] = sc.nextInt();
            }
        }
        int[][] transposta = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposta[i][j] + " ");

            }

            System.out.println();
        }

    }
}
