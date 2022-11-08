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
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("sayı1 ve sayı2 giriniz: ");
    int s1=input.nextInt();
    int s2=input.nextInt();
    int toplam=0;
    int s=0;
    while(s<s1){
        toplam=toplam+s2;
        s=s+1;
    }
    System.out.println("çarpımları:"+toplam);
    }
        
    }
    

