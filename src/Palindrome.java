import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.Integer.reverse;
public class Palindrome {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter an integer");
        int s =scan.nextInt();
        System.out.println(Pali(s));







    }

    public static int  Pali(int a) {
        int rev=0;
        int og=a;
        while (a!=0){
            rev =rev*10 + a%10;
            a=a/10;
        }
        if(rev==og){
            System.out.println(og+" Is a Palindrome number");
        } else{
            System.out.println(og+" Is not Palindrome number");
        }

        return rev;
    }

}


