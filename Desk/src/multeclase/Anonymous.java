/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multeclase;

/**
 *
 * @author danie
 */
public class Anonymous {
    //Inner interface Helloworld
    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someone);
        //public void sayHello();
    }
    //Method sayHello prints
    public void sayHello(){
        //Local class EnglishGreetings implemented in the method SayHello()
        class EnglishGreeting implements HelloWorld{
            String name= "world";
            @Override
            public void greet(){
                greetSomeone("world");
            }
            @Override
            public void greetSomeone(String Someone){
                String someone = null;
                name= someone;
                System.out.println("Hello"+name);
            }
        }//end of EnglishGreeting local class
        // create an EnglishGreeting object/instance
        HelloWorld englishGreeting= new EnglishGreeting(); 
        class FrenchGreeting implements HelloWorld {
             //create an anonimous class that greets in French language
        //HelloWorld frenchGreeting;//end of anonimous class
        //frenchGreeting = new HelloWorld(){
            String name= "tout le monde";
            @Override
            public void greet(){
                greetSomeone("tout le monde");
            }
            @Override
            public void greetSomeone(String someone){
                name= someone;
                System.out.println("Salut"+ name);
            }
            
        };
        //create an anonimous class for spanisg language
         class SpanishGreeting implements HelloWorld {
        //HelloWorld spanishGreeting;
        //spanishGreeting= new HelloWorld(){
            String name= "mundo";
            @Override
            public void greet (){
                greetSomeone("mundo");
            }
            @Override
            public void greetSomeone(String someone){
                name= someone;
                System.out.println("Hola"+ name);   
            }//end of anonymous class
        };
        englishGreeting.greet();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting= new SpanishGreeting();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        
    }
    //main method
    public static void main(String[] args){
        Anonymous myApp= new Anonymous();
        myApp.sayHello();
    }

}