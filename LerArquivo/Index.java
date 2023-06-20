package LerArquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        escritor("arquivo.txt");
        ler("arquivo.txt");
    }

    public static void escritor(String path) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter(path);
            PrintWriter pw = new PrintWriter(fileWriter);
            System.out.println("Escreva algo, para sair digite '/fim'");

            String linha = "";

            while (!linha.equals("/fim")) {
                System.out.print("Escreva algo: ");
                linha = sc.nextLine();
                if (!linha.equals("/fim")) {
                    pw.println(linha);
                }
            }

            pw.close();
            fileWriter.close();
            sc.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void ler(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha = bufferedReader.readLine();
            System.out.println("Conteudo do arquivo: ");
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }

            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
