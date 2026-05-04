
package tp3.pkg2;
import java.util.Scanner;

public class TP32 {

    public static void main(String[] args) {
  Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int N = lector.nextInt();

        int i = 1;

        while (i <= N) {
            System.out.print(i + " ");
            i++;
        }

   
    }
}

