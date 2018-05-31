/*
read a pattern or regular expresion string and search a specified sources
 */
package cnp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *read a pattern or regular expresion string and search a specified sources
 * @author danie
 */
public class ReGex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scannerRegex = new Scanner(System.in); 
      System.out.println("^[1|2]{2}(0[1-9]|1[0-2]){2}(0[1-9]|2[0-9]|3[01]){4}(^[1|2][0-9]){4}[0-9]"); 
       // read the regular expresion 
      String regex = "^[1|2]{2}(0[1-9]|1[0-2]){2}(0[1-9]|2[0-9]|3[01]){4}(^[1|2][0-9]){4}[0-9]"; 
      try {
         // create a pattern using introduced regular expresion 
      Pattern pattern = Pattern.compile(regex); 
           // read the source string using a new Scanner object 
      Scanner scannerSourceString = new Scanner(System.in); 
      System.out.println("Insert source string: "); 
              String source = scannerSourceString.next(); 
     // create the matcher as result of applying regex on source string 
      Matcher matcher = pattern.matcher(source); 
       boolean found = false; 
       // if the regular expression or pattern was found 
       while (matcher.find()) { 
      String result; 
        result = String.format("I found text \"%s\" starting at " + 
         "index %d until index %d.", 
        matcher.group(), 
        matcher.start(), 
        matcher.end()); 
      System.out.println(result);
         found = true; 
      // if regular expression or pattern was not found in source string   
       }
       if (!found) { 
            System.out.println("No match found :("); 
        }
        }//try
       catch (PatternSyntaxException e ){
             System.out.println(" + e.getDescription()");  
               }
                         }
      
           
       
    }
    
