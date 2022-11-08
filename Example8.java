/* başla
 * iletkenin direncini gir
 * iletkenin akımını gir
 * gerilimin formülünü gir
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("iletkenin direncini giriniz: ");
    double direnç = input.nextDouble();
    System.out.println("iletkenin akımını giriniz: ");
    double akım = input.nextDouble();
    double gerilim = (akım*direnç);
    System.out.println("iletkenin gerilimi: "+gerilim);
    
    }
    
}
