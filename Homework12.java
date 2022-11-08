//klavyeden eleman sayısı girilen bir kümenin belirtilen kombinasyonlarını sayısını hesapla
import java.util.Scanner;
public class Homework4 {

    public static void main(String[] args) {
        {float f1=1,f2=1,f3=1,k;
        int n,r;
    Scanner input=new Scanner(System.in);
    System.out.println("n giriniz");
    n=input.nextInt();
    System.out.println("r giriniz");
    r=input.nextInt();
    for(int s=1;s<=n;s++){
        f1=f1*s;
    if(s<=r)
        f2=f2*s;
    if(s<=n-r)
        f3=f3*s;
    }
    k=f1/(f2*f3);
    System.out.println("sonuç: "+k);
      
   
    
    }
    
        
        }
    }
        
    

