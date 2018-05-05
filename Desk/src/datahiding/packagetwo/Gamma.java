/*
 *Gamma
 */
package datahiding.packagetwo;

import datahiding.packageone.Alfa;

/**
 *Gamma
 * @author danie
 */
public class Gamma {
    Alfa alfaObject = new Alfa();
    
    public void testAlfaFromOtherPackahe(){
        
        alfaObject.publicAttribute = 32; 
        // alfaObject.privateAttribute = 34; 
        //alfaObject.protectedAttribute= 35;
        //alfaObject.packageAttribute = 36; 
    }
    
}
