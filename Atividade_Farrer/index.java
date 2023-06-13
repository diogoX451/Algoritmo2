package Atividade_Farrer;

import javax.swing.JOptionPane;

public class index {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a quantidade de numeros que voce quer armazenar: ");
        int numero = Integer.parseInt(input);
        if(numero > 1000){
            System.out.println("O numero digitado é maior que 1000");
            System.exit(0);
        }
        int vetor[] = new int[numero];
        int menor = 0;
    
        for(int i = 0; i < numero; i++) {
            String input2 = JOptionPane.showInputDialog("Digite o numero: ");
            int numero2 = Integer.parseInt(input2);
            vetor[i] = numero2;
        }    

        for (int i = 0; i < numero - 1; i++) {
            menor = i;
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }
        }
    
        System.out.println("Vetor ordenado: " );
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        int novoVetor = vetor.length;
        int[] numeroRep = new int[novoVetor];
        int indiceRepetidos = 0;

        int[] repeticoes = new int[novoVetor];
        int indiceRepeticoes = 0;
        
        for (int i = 0; i < novoVetor - 1; i++) {
            if (vetor[i] == vetor[i + 1]) {
                int numeroRepetido = vetor[i];
                boolean numeroJaRegistrado = false;
                for (int j = 0; j < indiceRepetidos; j++) {
                    if (numeroRep[j] == numeroRepetido) {
                        numeroJaRegistrado = true;
                        break;
                    }
                }
        
                if (!numeroJaRegistrado) {
                    numeroRep[indiceRepetidos++] = numeroRepetido;
                    repeticoes[indiceRepeticoes++] = 1;
                } else {
                    repeticoes[indiceRepeticoes - 1]++;
                }
            }
        }
        
        for (int i = 0; i < indiceRepetidos; i++) {
            int numeroRepetido = numeroRep[i];
            boolean repeticao = true;
            for (int j = 0; j < novoVetor; j++) {
                if (vetor[j] == numeroRepetido) {
                    if (!repeticao) {
                        for (int k = j; k < novoVetor - 1; k++) {
                            vetor[k] = vetor[k + 1];
                        }
                        novoVetor--;
                        j--; 
                    }
                    repeticao = false;
                }
            }
        }
        
        for (int i = 0; i < indiceRepetidos; i++) {
            System.out.println("Número: " + numeroRep[i] + " | Repetições: " + repeticoes[i]);
        }
        
        for(int i = 0; i < novoVetor; i++) {
            System.out.println("Novo vetor " + vetor[i]);
        }        
        
    }
        
}
