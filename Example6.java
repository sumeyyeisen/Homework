/* başla
 * küreye ait yarıçapı gir
 * hacimin formülünü gir
 * alanın formülünü gir
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("küreye ait yarıçapı giriniz");
    double yarıçap = input.nextDouble();
    final double pi = 3.1415;
    double hacim = (yarıçap*yarıçap*yarıçap *pi * 4/3);
    System.out.println("kürenin hacmi: "+hacim);
    double alan = (yarıçap*yarıçap*4*3.1415);
    System.out.println("kürenin alanı: "+alan);
    
    
    
    
         
    
    
    
    }
    
}
