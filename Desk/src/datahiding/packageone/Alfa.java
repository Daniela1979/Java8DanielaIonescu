/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahiding.packageone;

/**
 *
 * @author danie
 */
public class Alfa {

   public int publicAttribute = 10; 
    protected int protectedAttribute = 20 ;
    private int privateAttribute = 30; 
    int packageAttribute = 40;
    public void testIntern(){
    
        this.publicAttribute = 1; 
        this.protectedAttribute = 2; 
        this.privateAttribute = 3; 
        this.packageAttribute = 4; 
    }
    
}
