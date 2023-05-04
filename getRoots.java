//day1 p8
import java.util.*;
public class getRoots{
    public static void main(String... args){
        Scanner sc = new Scanner (System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        
        double d= Math.pow(b,2)- (4*a*c);
        if (d==0){
            double s1 = (-b)/(2*a);
            System.out.println("roots are equal = "+s1);
        }
        else if(d<0){
            System.out.println("Roots does not exist.");
        }
        else{
            double s2 = (-b+ Math.sqrt(d))/(2*a);
            double s3 = (-b- Math.sqrt(d))/(2*a);
            System.out.println("roots are different. r1 = "+s2+" r2 = "+s3);
        }
        


        //System.out.println(d);
    }
}