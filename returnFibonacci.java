//day3 p11
import java.util.*;
public class returnFibonacci{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0, n2=1 , n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;++i){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
} 