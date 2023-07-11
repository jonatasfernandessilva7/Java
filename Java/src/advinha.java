import java.util.Random;
import java.util.Scanner;

public class advinha {
    public static void main(String[] args){

        /*Escreva um programa que peça ao usuário para adivinhar um número
        entre 1 e 100. Se o usuário adivinhar incorretamente, o programa deve
        dizer se o número a ser adivinhado é maior ou menor do que o número
        digitado pelo usuário. O programa deve continuar a pedir ao usuário que
        adivinhe até que ele adivinhe corretamente.*/

        Scanner input  = new Scanner(System.in);
        Random gerador = new Random();

        int numeroDoUsuario;
        int numeroSys = gerador.nextInt(100);

        do{
            System.out.print("advinhe um numero entre 1 e 100: ");
            numeroDoUsuario = input.nextInt();

            if (numeroSys > numeroDoUsuario){
                System.out.println("numero da maquina eh maior que o do usuario");
            }else{
                System.out.println("numero da maquina eh menor do que o do usuario");
            }
        }while(numeroSys != numeroDoUsuario);

        System.out.println("parabéns você acertou");

    }
}
