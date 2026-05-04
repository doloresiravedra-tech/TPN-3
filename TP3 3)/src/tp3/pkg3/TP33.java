
package tp3.pkg3;
import java.util.Scanner;

public class TP33 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa un numero : ");
       int contador = teclado.nextInt();
       while (contador >= 1){
               
           System.out.println("Contador = " + contador);
           contador = contador - 1;
           
           
       }
    }
    
}
