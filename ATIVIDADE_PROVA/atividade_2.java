package ATIVIDADE_PROVA;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe valor da linha: ");
        int linha =  sc.nextInt();
        System.out.print("Informe valor da coluna: ");
        int coluna = sc.nextInt();
        int matriz[][] = new int[10][20];

        for(int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                System.out.print("Digite o valor . linha " + i + " e coluna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        int matrizAdd[][] = new int[linha][coluna + 1];

        for(int i = 0; i < linha; i++){
            int multi = 1;
            for (int j = 0; j < coluna; j++){
                matrizAdd[i][j] = matriz[i][j];
                multi *= matrizAdd[i][j];
            }
            matrizAdd[i][coluna] = multi;
        }

        for(int i = 0; i < linha; i++){
            for (int j = 0; j <= coluna ; j++){
                System.out.print(matrizAdd[i][j] + " ");
            }
            System.out.println();
        }
        sc.close(); 
    }

}