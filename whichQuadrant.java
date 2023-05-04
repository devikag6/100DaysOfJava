//day1 p6
import java.util.*;
public class whichQuadrant{
    public static void main(String... args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("Quadrant-I");
        }
        else if(x>0 && y<0){
            System.out.println("Quadrant-II");
        }
        else if(x<0 && y<0){
            System.out.println("Quadrant-III");
        }
        else{
            System.out.println("Quadrant-IV");
        }
    }
}