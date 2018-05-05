/*
 * SubAlfa extends Alfa
 */
package datahiding.packagetwo;

import datahiding.packageone.Alfa;

/**
 *
 * @author danie
 */
public class SubAlfa extends Alfa {
    
    public void testParentFromOtherPackage(){
    
        super.publicAttribute = 44; 
        super.protectedAttribute = 45; 
        //super.privateAttribute = 46;
        //.super.packageAttribute = 47 ; 
    }
    
}
