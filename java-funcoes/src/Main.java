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

        int[] vetor = new int[tamanhoDefinidoPeloUsuario];

        for (int i  = 0; i < tamanhoDefinidoPeloUsuario; i++){
            System.out.println("adicione um numero ao vetor: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("a soma dos numeros do vetor eh: "+somaVetor(vetor));

        /*Média: Sua função deverá receber dois vetores como entrada e retornar a
        média dos valores presentes nos vetores.*/

        System.out.println("a media dos numero do vetor eh: "+mediaDoVetor(vetor));
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
}