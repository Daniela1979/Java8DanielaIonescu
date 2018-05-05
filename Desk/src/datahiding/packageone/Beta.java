/*
 * Class Beta
 */
package datahiding.packageone;

/**
 * Class Beta
 * @author danie
 */
public class Beta {
    public void testAlfa(){
    Alfa alfaObject = new Alfa();
    alfaObject.publicAttribute = 2; 
    alfaObject.protectedAttribute = 3; 
    //alfaObject.privateAttribute = 4;
    alfaObject.packageAttribute = 5 ; 
            
    }
    
}
