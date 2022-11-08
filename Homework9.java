// klavyeden girilen poz. bir a tam sayısının tam bölenlerini hesaplayıp listele

import java.util.Scanner;
public class Homework1 {


    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("pozitif bir a tam sayısı giriniz");
   int a=input.nextInt();
   int bölen=1;
   while(bölen<=a){
       if(a%bölen==0){
           System.out.println("bölenleri: "+bölen);
       }
       bölen++;
   }   
}
}
