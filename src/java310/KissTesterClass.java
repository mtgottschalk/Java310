/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java310;
import static kiss.API.*;
/**
 *
 * @author leoth_000
 */
public class KissTesterClass {
    class Bird{
        
        void live(){
            println("Chirp");
        }
        void testBird(){
        Bird bird = new Bird();
        try(Close out = outExpect("Chirp")) {bird.live();}
    }
    }
    void testKiss(){
        test(new Bird());
    }
}
