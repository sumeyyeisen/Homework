 /* adım 1 : başla
    adım 2 : sayı al/oku
    adım 3 : eğer sayi<0 ise negatif yazdır
    adım 4 : eğer sayi=0 ise sıfır yazdır
    adım 5 : eğer sayı>0 ise pozitif yazdır
    adım 6 : bitir
 */

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
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi= input.nextInt();
        if(sayi<0) {
            System.out.println("negatif");
        }
        else if(sayi==0) {
            System.out.println("sıfır");
        }
        else if(sayi>0){
            System.out.println("pozitif");
        }
                    
            
        }
            
        
    }
    

