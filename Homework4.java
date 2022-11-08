/*  1: başla
    2: sayı al/oku
    3: eğer sayi=1 ; pazartesi yazdır
    4: eğer sayi=2 ; salı yazdır
    5: eğer sayi=3 ; çarşamba yazdır 
    6: eğer sayi=4 ; perşembe yazdır 
    7: eğer sayi=5 ; cuma yazdır
    8: eğer sayi=6 ; cumartesi yazdır
    9: eğer sayi=7 ; pazar yazdır
    10: bitir
 */

/**
 *
 * @author sumey
 */
import java.util.Scanner;
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi=input.nextInt();
        if(sayi==1) {
            System.out.println("pazartesi");
        }
        else if(sayi==2){
            System.out.println("salı");
        }
        else if(sayi==3){
            System.out.println("çarşamba");
        }
        else if(sayi==4){
            System.out.println("perşembe");
        }
        else if(sayi==5){
            System.out.println("cuma");
        }
        else if(sayi==6){
            System.out.println("cumartesi");
        }
        else if(sayi==7){
            System.out.println("pazar");
        }
        
        }
            
    }
    

