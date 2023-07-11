import java.util.Scanner;

public class sequenciaEmPares {
    public static void main(String[] agrs){

        /*Faça um programa que possa exibir uma sequência como a abaixo,
        sendo o limite superior dos pares da esquerda e direita informados pelo
        usuário. Exemplo: com pares da esquerda e direta com o limite superior
        de 2 unidades.*/

        Scanner input = new Scanner(System.in);

        int tamanhoEsquerdoDefinidoPeloUsuario, tamanhoDireitoDefinidoPeloUsuario;

        System.out.print("Defina um tamanho horizontal para a sequencia: ");
        tamanhoEsquerdoDefinidoPeloUsuario = input.nextInt();
        System.out.print("Defina um tamanho vertical  para a sequencia: ");
        tamanhoDireitoDefinidoPeloUsuario = input.nextInt();


        int sequencia[][] = new int[tamanhoDireitoDefinidoPeloUsuario][tamanhoEsquerdoDefinidoPeloUsuario];

        for (int i = 0; i < tamanhoDireitoDefinidoPeloUsuario; i++){
            for (int j = i; j < tamanhoEsquerdoDefinidoPeloUsuario ; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
