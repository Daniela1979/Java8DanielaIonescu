/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author danie
 */
public class Autoservice {

    /**
     * Autoservice class
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Masina1 mertzan= new Masina1("MERCEDES",230,Masina1.Culoare.GREEN);
        Masina1 dacia= new Masina1("DACIA",180,Masina1.Culoare.GREEN);
        Masina1 logan= new Masina1("LOGAN",210,Masina1.Culoare.MAGENTA);
        
        
        mertzan.setMarca("MERCEDES"); 
        mertzan.setVitezaMaxima(260);
        mertzan.setCuloare(Masina1.Culoare.RED);
        
        
        
        
    }
    
}
