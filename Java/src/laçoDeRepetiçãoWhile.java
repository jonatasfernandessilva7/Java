import java.util.Scanner;

public class laçoDeRepetiçãoWhile {
    public static void main(String[] args){

        /*Escreva um programa que leia uma sequência de números do usuário e
        pare a leitura quando o usuário digitar um número negativo. Em seguida,
        o programa deve imprimir a soma dos números positivos lidos.*/

        Scanner input = new Scanner(System.in);

        double somaNumeros = 0;
        double numero = 0;

        do{
            System.out.print("digite um numero: ");
            numero = input.nextDouble();
            if (numero > 0){
                somaNumeros += numero;
            }
        }while( numero >= 0);

        System.out.println("a soma de todos os números digitados eh de: "+somaNumeros);
    }
}
