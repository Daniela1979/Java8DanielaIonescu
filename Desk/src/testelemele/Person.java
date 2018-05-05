/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelemele;

/**
 *
 * @author danie
 */
import java.util.Scanner; 

public class Person {
  
  public static void main (String[] args){
      Scanner input = new Scanner (System.in);
      System.out.print("What is your name?");
             String yourName= input.nextLine();
             System.out.print("Hello," + (yourName)+("!"));
    }
 
};
