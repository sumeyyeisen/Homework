/* başla
 * üçgenin kenar uzunluğunu giriniz.
 * kenara ait yüksekliği giriniz
 * alanın formülünü giriniz.
 * üçgenin alanı
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("üçgenin kenar uzunluğunu giriniz: ");
    double kenar = input.nextDouble();
    System.out.println("kenara ait yüksekliği giriniz: ");
    double yükseklik = input.nextDouble();
    double alan = (kenar*yükseklik/2);
    System.out.println("üçgenin alanı: "+alan);
            
           
    
    }
    
}
