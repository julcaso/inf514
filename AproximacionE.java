import java.util.Scanner;

public class AproximacionE{
    public static void main (String args []){

        double x=0.0;
        double r = 0.0;
        double factorial=1.0;

        //entrada de datos.
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre valor de x: ");
        x = scn.nextDouble();

        //Calculo de la expresion matematica.
        for(int i=0; i<=8; i++){
            //calcular factorial. 
            for (int j = 0; j<=i; j++){
                if (j == 0) {
                    factorial = 1.0;
                } else {
                    factorial = factorial * j;
                }
            }
            //Realiza acumulacion de expresion matematica            
            r = r + Math.pow(x,i)/factorial;
            System.out.println("Resultado de expresion matematica: " + r);
        }

        
    }
}