import java.util.Scanner;

public class questão04 {
    public static void main(String[] args){

        /*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
        imprima: "número válido". Caso as afirmações não sejam verdadeiras,
        Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
        diferentes de 10; A é menor que 10) caso não seja verdade imprima:
        "número não válido".*/

        Scanner input = new Scanner(System.in);

        double A, B;

        System.out.print("escreva um valor para a variael A: ");
        A = input.nextDouble();
        System.out.print("escreva um outro valor para a variavel B: ");
        B = input.nextDouble();

        if ( A == 10 || ( A + B ) == 20){
            System.out.println("numero valido");
        }else {
            if ( A == B){
                System.out.println("A eh igual a B; A e B ao diferentes de 10; A é menor que 10");
            }else{
                System.out.println("numero não valido");
            }
        }
    }
}
