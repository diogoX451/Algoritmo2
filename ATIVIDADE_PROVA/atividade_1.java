package ATIVIDADE_PROVA;

import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 121;
        int temp[] = new int[day];
        int menor = 0;
        int maior = 0;
        int media = 0;

        for (int i = 0; i < day; i++) {
            System.out.print("Informe a temperatura do dia " + i + ": ");
            temp[i] = sc.nextInt();
            if (temp[i] < 15 || temp[i] > 40) {
                System.out.println("Temperatura não permitida, digite novamente");
                i--;
                continue;
            }

            menor = temp[0];
            if (temp[i] < menor) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
        }

        for (int i = 0; i < day; i++) {
            int soma = 0;
            soma += temp[i];
            media = soma / day;

        }

        System.out.println("A média das temperaturas foi: " + media);
        System.out.println("A menor temperatura foi: " + menor);
        System.out.println("A maior temperatura foi: " + maior);
        sc.close();
    }
}


   