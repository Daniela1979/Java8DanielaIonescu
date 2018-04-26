/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        double result = 0; // initializarea 
        if (operator.equals("+")){
            result = x+y;
        }else if (operator.equals("-")){
            result = x-y;
        }else if (operator.equals ("*")){
            result = x*y;
        } else if (operator.equals("/")){
            result = x/y;
          
        }
        System.out.println("Result is "+result);
        
        
    
}
}
