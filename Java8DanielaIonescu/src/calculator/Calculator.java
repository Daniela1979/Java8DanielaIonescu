
/*
 
 */
package calculator;

/**
 *
 * @author danie
 */
import java.util.Scanner; 
public class Calculator {
    
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please introduce your first number");
        float x = sc.nextFloat();
        
        System.out.println("Please introduce operator");
        String operator = sc.next();
        
        System.out.println("Please introduce second number");
        float y = sc.nextFloat();
        
        System.out.println("Please introduce =");
        
        float result = 0;   // initializarea 
                
        switch(operator){
            
           case ("+"):
           result = x+y;
           break; 
                 
           case ("-") :
           result = x-y;
           break;
        
           case ("*") :
            result = x*y;
            break; 
        
           case ("/") :
            result = x/y;
            break; 
          
           default :
               System.out.println("Sorry, you introduced wrong data. I quit !");
    
}
        System.out.println("Result is " + result);
        
}
}
