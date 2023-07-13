public class Main {
    public static void main(String[] args){

        /*Somatório: Sua função deverá receber um vetor como parâmetro e retornar
        a soma de todos elementos do vetor, sendo que as primeiras duas e as
        últimas posições do vetor de entrada não devem ser consideradas;*/

        int[] vetor = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("a soma dos numeros do vetor eh: "+somaVetor(vetor));
        System.out.println("a media dos numero do vetor eh: "+mediaDoVetor(vetor));
    }

    public static double somaVetor(int[] vetor){

        double somaDosNumerosDoVetor = 0;

        for (int i:vetor){
            somaDosNumerosDoVetor += i;
        }
        return somaDosNumerosDoVetor;
    }

    public static double mediaDoVetor(int[] vetor){

        double mediaDosNumemerosDoVetor;

        mediaDosNumemerosDoVetor = somaVetor(vetor)/vetor.length;

        return mediaDosNumemerosDoVetor;
    }
}