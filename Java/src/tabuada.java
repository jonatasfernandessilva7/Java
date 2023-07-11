import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){

        /*Escreva um programa que imprima a tabela de multiplicação de um
        número específico fornecido pelo usuário usando um loop while.*/

        Scanner input = new Scanner(System.in);

        int numeroDoUsuario, valorMaxMultiplicacao;

        System.out.print("digite o ate qual valor deseja multiplicar: ");
        valorMaxMultiplicacao = input.nextInt();
        System.out.print("escreva o numero a qual deseja multiplicar: ");
        numeroDoUsuario = input.nextInt();
        while (valorMaxMultiplicacao > 0){
            System.out.println("o resultado da multiplicação de "+numeroDoUsuario+ "x" +valorMaxMultiplicacao+ " eh de: "+ (numeroDoUsuario*valorMaxMultiplicacao));
            valorMaxMultiplicacao --;
        }
    }
}
