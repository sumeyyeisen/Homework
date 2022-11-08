/* başla
 * yarıçapı gir
 * yüksekliği gir
 * kesit alanının formülünü gir
 * hacim formülünü gir
 * dayanıklılığın formülünü gir
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("yarıçapı giriniz");
    double yarıçap = input.nextDouble();
    System.out.println("yüksekliği giriniz");
    double yükseklik = input.nextDouble();
    double kesitalanı = (yarıçap*yarıçap*3.1415);
    System.out.println("silindirin kesit alanı: "+kesitalanı);
    double hacim = (3.1415*yarıçap*yarıçap*yükseklik);
    System.out.println("silindirin hacmi: "+hacim);
    double dayanıklılık = (1/yükseklik);
    System.out.println("silindirin dayanıklılığı: "+dayanıklılık);
    
    
    
    
    
    
    
    
    
    }
    
}
