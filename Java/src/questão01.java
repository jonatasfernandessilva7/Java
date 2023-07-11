import java.util.Scanner;

public class questão01 {
    public static void main(String[] args){
        /* 01 - Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
           se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
           segunda afirmação não seja verdadeira, imprima: "número não válido". */

        Scanner input = new Scanner(System.in);

        double A, B;

        System.out.print("escreva um valor para a variael A: ");
        A = input.nextDouble();
        System.out.print("escreva um outro valor para a variavel B: ");
        B = input.nextDouble();

        if ( A > 10 ){
            System.out.println("A > 10");
        }

        if ( ( A + B ) == 20 ){
            System.out.println("A + B == 20");
        }else{
            System.out.println("Número não valido");
        }
    }
}