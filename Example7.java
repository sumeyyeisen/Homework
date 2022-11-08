/* başla
 * maddenin kütlesini gir
 * maddenin hızını gir
 * maddenin yerden yüksekliğini gir
 * potansiyel enerjinin formülünü gir
 * kinetik enerjinin formülünü gir
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("maddenin kütlesini giriniz");
    double kütle = input.nextDouble();
    System.out.println("maddenin hızını giriniz");
    double hız = input.nextDouble();
    System.out.println("maddenin yerden yüksekliğini giriniz");
    double yükseklik = input.nextDouble();
    double potansiyel = (kütle*10*yükseklik);
    System.out.println("potansiyel enerji: "+potansiyel);
    double kinetik = (kütle*hız*hız*1/2);
    System.out.println("kinetik enerji: "+kinetik);
    
    
    
    
    
    
    }
    
}
