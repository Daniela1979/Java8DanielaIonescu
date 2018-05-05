/*
 * Delta the extended class of Alfa
 */
package datahiding.packageone;

/**
 *Delta the extended class of Alfa
 * @author danie
 */
public class Delta extends Alfa {
    
    public void testParent(){
        //super.privateAttribute = 11; 
        super.publicAttribute = 12; 
        super.protectedAttribute = 13; 
        super.packageAttribute = 14; 
    
    }
    
    
}
