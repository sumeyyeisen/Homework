/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("n sayısı al");
    int n=input.nextInt();
    int toplam=0;
    int s=1;
    while(s<=n){
        toplam=toplam+s*s;
        s=s+1;
    }
        System.out.println("n'e kadarki sayıların karelerinin toplamı: "+toplam);
    }
    
}
