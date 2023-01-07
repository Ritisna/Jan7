import java.time.Year;
public class YearExample1 {
    public static void main(String[]args){
        Year y = Year.of(2022);  
        System.out.println(y); 
        int a = Integer.MAX_VALUE;
        
        double c = 30;
        double b = 2;
        System.out.println(Math.pow(a, b));
 
        a = 3;
        b = 4;
        System.out.println(Math.pow(a, b));
 
        a = 2;
        b = 6;
        System.out.println(Math.pow(a, b));
    }
    
}
