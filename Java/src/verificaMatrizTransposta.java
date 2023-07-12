public class verificaMatrizTransposta {
    public static void main(String[] args) {

        /*Escreva um programa que utilize uma estrutura "if-else" para verificar se
        uma matriz é simétrica (ou seja, a matriz é igual à sua transposta).*/

        int[][] matriz = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};

        if (verificarSimetria(matriz)) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }

    public static boolean verificarSimetria(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
