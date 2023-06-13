import javax.swing.JOptionPane;

class PalavraInvertida {
    public static void main(String[] args) {
        String palavra;
        String palavraInvertida;
        int i, j;
        palavra = JOptionPane.showInputDialog("Insire uma palavra");
        palavraInvertida = "";
        for (i = 0; i < palavra.length(); i++) {
            // verificar cada index
            System.out.println(palavra.charAt(i));
        }
        for (j = i - 1; 0 <= j; j--) {
            System.out.println(j + " " + i);
            palavraInvertida += palavra.charAt(j);
            System.out.println(palavraInvertida);
        }
    }
}
