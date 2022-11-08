import java.util.Scanner;
public class Homework5 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("x gir");
    int x=input.nextInt();
    int fx=x*x-5*x+3;
    if(fx<0){
        System.out.println("-1");
    }
    else if(fx==0){
        System.out.println("0");
    }
    else {
        System.out.println("+1");
    }
    
    
    
    
    
    
    }
    
}
