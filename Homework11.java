// klavyeden girilen sayıyı tersten yazdır.

import java.util.Scanner;
public class Homework3 {

   
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("sayı giriniz");
    int sayi=input.nextInt();
    int sayinin_tersi=0;
    while(sayi!=0){
        sayinin_tersi=sayinin_tersi*10;
        sayinin_tersi=sayinin_tersi+sayi%10;
        sayi=sayi/10;
        
    }
    System.out.println("sayının tersten yazılışı: "+sayinin_tersi);
           
    }
    
}
