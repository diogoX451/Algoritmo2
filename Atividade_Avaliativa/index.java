package Atividade_Avaliativa;

import java.util.Arrays;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = new String();
        char palavra[] = new char[100];
        System.out.print("Digite alguma palavra: ");
        entrada = sc.nextLine();
        sc.close();
        int i, j;
        int index = 0;

        for (i = 0; i < entrada.length(); i++) {
            char semVogal = entrada.charAt(i);

            if (semVogal != 'a' && semVogal != 'A' && semVogal != 'e' && semVogal != 'E' && semVogal != 'i'
                    && semVogal != 'I' && semVogal != 'o' && semVogal != 'O' && semVogal != 'u'
                    && semVogal != 'U' && semVogal != 'á' && semVogal != 'à' && semVogal != 'ã' && semVogal != 'â' &&
                    semVogal != 'é' && semVogal != 'è' && semVogal != 'ê' &&
                    semVogal != 'í' && semVogal != 'ì' && semVogal != 'î' &&
                    semVogal != 'ó' && semVogal != 'ò' && semVogal != 'õ' && semVogal != 'ô' &&
                    semVogal != 'ú' && semVogal != 'ù' && semVogal != 'û') {

                palavra[index++] = semVogal;
            }
        }
        
        for (j = 0; j < index; j++) {
            System.out.println("Palavras sem Vogais" + " " + palavra[j]);
            
        }
        //Forma utilizando o recurso do java
        Arrays.sort(palavra, 0, index);
        System.out.println(palavra);
    }

}
