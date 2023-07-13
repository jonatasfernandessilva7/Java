import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*Somatório: Sua função deverá receber um vetor como parâmetro e retornar
        a soma de todos elementos do vetor, sendo que as primeiras duas e as
        últimas posições do vetor de entrada não devem ser consideradas;*/

        int tamanhoDefinidoPeloUsuario;
        System.out.println("defina o tamanho do vetor: ");
        tamanhoDefinidoPeloUsuario = input.nextInt();

        int tamanhoDoVetorDeMediasPonderadas;
        System.out.println("defina o tamanho do vetor de pesos de media ponderada: ");
        tamanhoDoVetorDeMediasPonderadas = input.nextInt();

        int[] vetor = new int[tamanhoDefinidoPeloUsuario];
        int[] vetorDePesosMediaPonderada = new int[tamanhoDoVetorDeMediasPonderadas];

        for (int i  = 0; i < tamanhoDefinidoPeloUsuario; i++){
            System.out.println("adicione um numero ao vetor: ");
            vetor[i] = input.nextInt();
        }

        for (int i  = 0; i < tamanhoDoVetorDeMediasPonderadas; i++){
            System.out.println("adicione um peso ao vetor: ");
            vetorDePesosMediaPonderada[i] = input.nextInt();
        }

        System.out.println("a soma dos numeros do vetor eh: "+somaVetor(vetor));

        /*Média: Sua função deverá receber dois vetores como entrada e retornar a
        média dos valores presentes nos vetores.*/

        System.out.println("a media dos numero do vetor eh: "+mediaDoVetor(vetor));

        /*Média ponderada: Sua função deverá receber um vetor de notas e um vetor
        de pesos correspondentes. A função deve retornar a média ponderada das
        notas. Exemplo: [7, 8, 6], [2, 3, 1] -> 7.33*/

        System.out.println("a media ponderada eh: "+mediaPonderadaVetor(vetor, vetorDePesosMediaPonderada));
    }

    public static int somaVetor(int[] vetor){

        int somaDosNumerosDoVetor = 0;
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

    public static double mediaPonderadaVetor(int[] vetor, int[]  vetorDePesosDeMedia){

        int somaVetorPesos = 0;
        int somaDasMultiplicacoes = 0;

        for ( int i = 0; i < vetor.length; i++){
            somaDasMultiplicacoes += (vetor[i] * vetorDePesosDeMedia[i]);
            somaVetorPesos += vetorDePesosDeMedia[i];
        }

        return (double) somaDasMultiplicacoes / somaVetorPesos;
    }

}