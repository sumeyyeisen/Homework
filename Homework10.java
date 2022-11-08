// klavyedden girilen n sayısına göre 1 den n'e kadar olan tamsayıların toplamı t1
// 1den n'e kadar olan tek tamsayıların toplamı t2
// 2'den n'e kadar olan çift sayıların toplamı t3

import java.util.Scanner;
public class Homework2 {

    public static void main(String[] args) {
        {int i,n; float t1=0,t2=0,t3=0;
    Scanner input=new Scanner(System.in);
    System.out.println("n giriniz");
    n=input.nextInt();
    for(i=1;i<=n;i++) t1+=i;
    for(i=1;i<=n;i+=2) t2+=i;
    for(i=2;i<=n;i+=2) t3+=i;
    System.out.println("1 den n e kadarki sayıların toplamı: "+t1);
    System.out.println("1 den n e kadarki tek sayıların toplamı: "+t2);
    System.out.println("1 den n e kadarki çift sayıların toplamı: "+t3);
    
    }
}    
}  
    
   
    
