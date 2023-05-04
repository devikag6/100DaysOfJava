//day1 p7
import java.util.*;
public class noOfDays{
    public static void main(String... args){
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if(month==4 || month==6 || month==9 || month==11){
            System.out.println(31);
        }
        else if(month==2){
            if(year % 4 == 0){
                    System.out.println(29);
                }
            else{
                    System.out.println(28);
                }
            }
        
        else{
            System.out.println(30);
        }
    }
}
