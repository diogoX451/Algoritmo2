import java.util.Scanner;

class Matrizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz");
        int linhas = scan.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz");
        int colunas = scan.nextInt();

        if (linhas <= 20) {
            if (colunas <= 50) {

                int[][] matriz = new int[linhas][colunas];
                int[][] matrizTransposta = new int[colunas][linhas];

                System.out.println("Matriz M[3][3]\n");

                for (int linha = 0; linha < linhas; linha++) {
                    for (int coluna = 0; coluna < colunas; coluna++) {
                        System.out.printf("Insira o elemento: ", linha + 1, coluna + 1);
                        matriz[linha][coluna] = scan.nextInt();
                    }
                }

                System.out.println("\n Matriz: \n");
                for (int linha = 0; linha < linhas; linha++) {
                    for (int coluna = 0; coluna < colunas; coluna++) {
                        System.out.printf("\tM[%d][%d]: ", linha + 1, coluna + 1);
                        System.out.printf("%d \t", matriz[linha][coluna]);
                    }
                    System.out.println();
                }

                for (int linha = 0; linha < colunas; linha++) {
                    for (int coluna = 0; coluna < linhas; coluna++) {
                        matrizTransposta[linha][coluna] = matriz[coluna][linha];
                    }
                }

                System.out.println("\n Matriz transposta: \n");
                for (int linha = 0; linha < colunas; linha++) {
                    for (int coluna = 0; coluna < linhas; coluna++) {
                        System.out.printf("\tM[%d][%d]: ", linha + 1, coluna + 1);
                        System.out.printf("%d \t", matrizTransposta[linha][coluna]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Colunas deve ser menor ou igual a 50");
            }
        }else{
            System.out.println("Linhas deve ser menor ou igual a 20");
        }
        scan.close();
    }
}