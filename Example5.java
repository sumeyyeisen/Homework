/* başla
 * açıyı derece cinsinden giriniz
 * radyanın formülünü giriniz
 * gradyanın formülünü gir
*/
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("derece cinsinden açıyı giriniz");
    double açı = input.nextDouble();
    final double pi = 3.1415;
    double radyan = (açı*pi/180);
    System.out.println("açının radyan cinsinden değeri: "+radyan);
    double gradyan = (açı*10/9);
    System.out.println("açının gradyan cinsinden değeri: "+gradyan);
    
    
   
    
           
    }
    
}
