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
public class Example10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n");
        int n=input.nextInt();
        int toplam=0 ;
        int s=1 ;
        while(s<=n){
            toplam=toplam+s ;
            s=s+2 ;
        }
            System.out.println("toplam: "+toplam);
        
    }
    
}
