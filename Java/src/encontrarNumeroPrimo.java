import java.util.Scanner;

public class encontrarNumeroPrimo {
    public static void main(String[] args){


        /*Crie um programa que use um loop "while" para encontrar o maior
        número primo que é menor do que um número fornecido pelo usuário.*/

        Scanner input = new Scanner(System.in);

        int numeroDoUsuario;

        System.out.println("digite um valor: ");
        numeroDoUsuario = input.nextInt();
        input.close();

        int contador = numeroDoUsuario - 1;

        while(contador > 1){

            if (verificaSeÉPrimo(contador)){
                System.out.println("o maior numero primo eh: "+contador);
                return;
            }

            contador --;
        }

        System.out.println("não existe numero");
    }

    public static boolean verificaSeÉPrimo( int numero){

        if ( numero < 2){
            return false;
        }

        for ( int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % 2 == 0){
                return false;
            }
        }

        return true;
    }
}
