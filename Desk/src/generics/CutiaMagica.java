/*
 Testing our cutie
 */
package generics;

/**
 Testing Out cutie
 * @author danie
 */
public class CutiaMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create two Cutie, one for Pantof and one for Cizma
        int cuc= 10;
        
        Cutie <Pantof> cutieDePantofi = new Cutie<>();
        Cutie <Cizma> cutieDeCizma = new Cutie <> (); 
        
        //testing object 
        cutieDePantofi.getT().message();
        cutieDeCizme.getT().message();
        
    }
    
}
