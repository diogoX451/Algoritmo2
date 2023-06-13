class pesquisa_binaria {
    void pesquisa(int lista[], Integer item) {
        int chuteBaixo = 0;
        int chuteAlto = lista.length - 1;
        while (chuteBaixo <= chuteAlto) {
            int chuteMeio = (chuteBaixo + chuteAlto) / 2;
            if (lista[chuteMeio] == item) {
                System.out.println("O chute foi encontrado " + lista[chuteMeio]);
                break;
            } else if (lista[chuteMeio] > item) {
                chuteAlto = chuteMeio - 1;
                System.out.println("O chute foi encontrado " + lista[chuteMeio]);
            } else {
                chuteBaixo = chuteMeio + 1;
                System.out.println("O chute foi encontrado " + lista[chuteMeio]);
            }
        }
    }

    public static void main(String[] args) {
        int lista[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer chute = 5;
        pesquisa_binaria pesquisa = new pesquisa_binaria();
        pesquisa.pesquisa(lista, chute);

    }

}
