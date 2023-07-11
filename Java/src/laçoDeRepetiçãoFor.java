import java.util.ArrayList;
public class laçoDeRepetiçãoFor {
    public static void main(String[] args){

        /*Escreva um programa que imprima todos os números pares de 1 a 100
        usando um loop for.*/

        ArrayList<Integer> numerosPares = new ArrayList();

        for ( int contador = 0; contador < 100 ; contador++) {
            if ( contador % 2 == 0) {
                numerosPares.add(contador);
            }
        }

        System.out.println(numerosPares);
    }
}
