/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("torbadaki mavi top sayısını giriniz");
        int mavi = input.nextInt();
        System.out.println("torbadaki kırmızı top sayısını giriniz");
        int kırmızı = input.nextInt();
        
        if(mavi<kırmızı) {
            System.out.println("kırmızı gelir");
        }
        else {
            System.out.println("mavi gelir");
            
        }
    }
    
}
