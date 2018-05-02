/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class DeskComputer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please introduce your first number");
        int firstNumber = sc.nextInt();
        
        System.out.println("Please introduce operator");
        String operator = sc.next();
        
        System.out.println("Please introduce the second number");
        int secondNumber = sc.nextInt();
        
//        System.out.println("Please introduce =");
//        String egal= sc.next();
        
        int result=0; 
        
        if (operator.equals("+")) {
            result= firstNumber + secondNumber;
        }
          if (operator.equals("-")) {
            result= firstNumber - secondNumber;
        }
          
        if (operator.equals("*")) {
            result= firstNumber * secondNumber;
        } 
    
        if (operator.equals("/")) {
            result= firstNumber / secondNumber;
        } 
        
        
        System.out.println("Result of " + firstNumber + operator + secondNumber+ " is " + result  );
        System.out.println("Result is " + result);
       
        
        
        
        
    }// aici se termina main
    
    
    
   
}
