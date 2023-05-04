//day3 p14
import java.util.*;
public class reverseNumber{
    public static void main (String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        for(int i=0;i<=n;i++){
            rev = n%10;
            if(n<10){
                System.out.print(n);
                break;
            }
            System.out.print(rev);
            n = n/10;
            
        }
    }
}