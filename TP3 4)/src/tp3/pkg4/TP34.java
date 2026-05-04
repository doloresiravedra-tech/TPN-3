
package tp3.pkg4;
import java.util.Scanner;

public class TP34 {

    public static void main(String[] args) {
        int contador = 0;
        int contador2 = 0;
        int contadorDoble = 0;
       Scanner teclado = new Scanner(System.in);
       Scanner teclado2 = new Scanner(System.in);
       System.out.println("Ingresa un numero : ");
       System.out.println("Agrega otro numero : ");
       contador = teclado.nextInt();
       contador2 = teclado2.nextInt();
        do{
     
       if (contador > contador2){
           contador2++;
           System.out.println("Contador2 = " + contador2);  
       }
       else{
           contador++;
           System.out.println("Contador = " + contador);
       
       }

     
        }while(contador != contador2);
           
    
    } 
    }


     