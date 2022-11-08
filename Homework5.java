/* 1:başla
    2:kenar1, kenar2, kenar3 gir
    3:eğer kenar1==kenar2 ve kenar1==kenar3 ; eşkenar 
    4:eğer kenar1==kenar2 ve kenar1!=kenar3 ; ikizkenar
    5:eğer kenar1==kenar3 ve kenar1!=kenar2 ; ikizkenar
    6:eğer kenar2==kenar3 ve kenar2!=kenar1 ; ikizkenar
    7:eğer kenar1!=kenar2 ve kenar2!=kenar3 ve kenar1!=kenar3 ; çeşitkenar
    8:bitir
 */

import java.util.Scanner;
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kenar1, kenar2, kenar3 gir");
        int kenar1=input.nextInt();
        int kenar2=input.nextInt();
        int kenar3=input.nextInt();
        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("eşkenar");
        }
        else if(kenar1==kenar2 && kenar1!=kenar3) {
            System.out.println("ikizkenar");
        }
        else if(kenar1==kenar3 && kenar1!=kenar2) {
            System.out.println("ikizkenar");
        }
        else if(kenar2==kenar3 && kenar2!=kenar1) {
            System.out.println("ikizkenar");
        }
        else if(kenar1!=kenar2 && kenar1!=kenar3) {
            System.out.println("çeşitkenar");
        }
        else if(kenar1!=kenar2 && kenar2!=kenar3) {
            System.out.println("çeşitkenar");
        }
        }
        }       
        
    
