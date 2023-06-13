package AULA;

import java.util.Scanner;

class AlgAula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string com no máximo 100 caracteres: ");
        String entrada = sc.nextLine();
        sc.close();

        char[] saida = new char[100];
        int idx = 0;
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' && c != 'o' && c != 'O' && c != 'u'
                    && c != 'U') {
                saida[idx++] = c;

            }
        }

        System.out.print("Saída: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(saida[i]);
        }

    }
}
