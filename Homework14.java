import java.util.Scanner;
public class Homework14 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("uzunluk gir");
    int m=input.nextInt();
    System.out.println("mm için 1,cm için 2, dm için 3,km için 4 giriniz");
    double değer=input.nextDouble();
    if(değer==1){
        m*=1000;
    }
    else if(değer==2){
        m*=100;
    }
    else if(değer==3){
        m*=10;
    }
    else if(değer==4){
        m/=1000;
    }
    System.out.println(m);
       
       
    
    
}
}