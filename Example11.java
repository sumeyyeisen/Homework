/* başla
 * vize notunu gir
 * final notunu gir
 * ortalamasının formülünü gir
 * sonuç 50 den düşükse dersten bırak
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("vize notunuzu giriniz");
    double vize = input.nextDouble();
    System.out.println("final notunuzu giriniz");
    double finall = input.nextDouble();
    double ortalama=vize*0.4+finall*0.6;
    System.out.println("ortalamanız: "+ortalama);
    if(ortalama<50) {
        System.out.println("dersten geçemediniz");
    }
    else {
        System.out.println("dersten geçtiniz");
    }
    }
    
}
