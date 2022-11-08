/* başla
 * maddenin hacmini gir
 * maddenin mol sayısını gir
 * maddenin sıcaklığını gir
 * basıncın formülünü gir 
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("maddenin hacmini giriniz");
    double hacim = input.nextDouble();
    System.out.println("maddenin mol sayısını giriniz");
    double mol = input.nextDouble();
    System.out.println("maddenin sıcaklığını giriniz");
    double sıcaklık = input.nextDouble();
    double basınç = (mol*0.082*sıcaklık/hacim);
    System.out.println("basınç: "+basınç);
    
    
    }
    
}
