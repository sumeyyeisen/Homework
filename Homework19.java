import java.util.Scanner;
public class Homework19 {

  
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in); 
    System.out.println("tamsayı giriniz");
    int s=input.nextInt();
    for(int a=0 ; a<=s/3 ; a++)
        for(int b=0 ; b<=s/5 ; b++)
            if(s==a*3+b*5)
                System.out.println(a+"-"+b);
    }
    
}
