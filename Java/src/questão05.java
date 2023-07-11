import java.util.Scanner;

public class questão05 {
    public static void main(String[] args){

        /*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
        imprima: "número válido". Caso as afirmações não sejam verdadeiras,
        imprima: "número não válido".*/

        Scanner input = new Scanner(System.in);

        double A, B;

        System.out.print("escreva um valor para a variael A: ");
        A = input.nextDouble();
        System.out.print("escreva um outro valor para a variavel B: ");
        B = input.nextDouble();

        if ( A == 10 || ( A + B ) == 20){
            System.out.println("numero valido");
        }else {
            System.out.println("numero não valido");
        }
    }
}
