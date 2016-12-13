package java310;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JunitTest {
    @Test
	
   public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
    }
   
   class Math{
    int x;
    int y;
    
    int adding(int a, int b){
        x = a;
        y = b;
        return x+y;
    }
    void testAdding(){
        Math math = new Math();
        math.adding(2, 3);
        assertEquals(2,math.x);
        assertEquals(3,math.y);
        
    }
}
}

