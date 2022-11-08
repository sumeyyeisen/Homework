import java.util.Scanner;
public class Homework18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir tam sayıyı giriniz");
        int s=input.nextInt();
    
        for(int a=0 ; a<=s ; a++)
            for(int b=0 ; b<=s ; b++) 
                if(a*a+b*b==s)
                    System.out.println(a+"-"+b); }
                
                
            
        
    
    
}
}
