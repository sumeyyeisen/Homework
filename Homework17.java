//    ****
//    ***
//    **
//    *
import java.util.Scanner;
public class Homework1 {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("satır gir");
        int satır=input.nextInt();
        for(int i=1 ; i<=satır ; i++ ){
            for(int j=satır ; j>=i ; j--){
                System.out.print("*");
            }
        System.out.println();
            
        }
    
    }
    
}
