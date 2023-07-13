public class Main {
    public static void main(String[] args){

        /*Somatório: Sua função deverá receber um vetor como parâmetro e retornar
        a soma de todos elementos do vetor, sendo que as primeiras duas e as
        últimas posições do vetor de entrada não devem ser consideradas;*/

        int[] vetor = {1,2,3,4,5,6,7,8,9,10};

        System.out.print(somaVetor(vetor));
    }

    public static int somaVetor(int[] vetor){

        int somaDosNumerosDoVetor = 0;

        for (int i:vetor){
            somaDosNumerosDoVetor += i;
        }
        return somaDosNumerosDoVetor;
    }
}