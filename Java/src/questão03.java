import java.util.Scanner;

public class questão03 {
    public static void main(String[] args){

        /*Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
        se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
        se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
        impressões são permitidas na saída do programa).*/

        Scanner input = new Scanner(System.in);

        double A, B;

        System.out.print("escreva um valor para a variael A: ");
        A = input.nextDouble();
        System.out.print("escreva um outro valor para a variavel B: ");
        B = input.nextDouble();

        if ( A == 10 ){
            System.out.println("A == 10");
        }

        if ( ( A + B ) == 20 ){
            System.out.println("A < B == 20");
        }else{
            System.out.println("Número não valido");
        }

        if ( B == 10 ){
            System.out.println("B == 10");
        }
    }
}
