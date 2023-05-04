//day2 p10
import java.util.*;
public class returnFactorial{
    // public static int facOfNum(int n){
        
    // }
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=1;
        if(n==0 ){
            System.out.println(1);
        }
        else if(n==1 || n==2){
            System.out.println(n);
        }
        else{
            for(int i=n;i>1;i--){
                fac=fac*i;
            }
            System.out.println(fac);
            
        }
    }
}