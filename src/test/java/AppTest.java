import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertEquals; 

public class AppTest 
{
    App app; 
    @Test
    public void square_root_test()
    {
        assertEquals("Square Root testing [positive]" , app.sqrt(9) , 3 , 0.00001);
        assertEquals("Square Root testing [negative]" , app.sqrt(-1) , -1 , 0.00001); 
        //assertEquals("Square Root testing [large positive]" , app.sqrt(180625) , 425 , 0.00001); 
    }

    @Test 
    public void fact_test()
    {
        assertEquals("Factorial testing [positive]" , app.fact(4) , 24 , 0.00001); 
        assertEquals("Factorial testing [large positive]" , app.fact(10) , 3628800, 0.00001); 
        assertEquals("Factorial testing [negative]" , app.fact(-1) , -1 , 0.00001); 
    }
    
    @Test
    public void natural_log_test()
    {
        assertEquals("Natural Log testing [positive]" , app.natural_log(8) , 2.07944154 , 0.00001); 
        assertEquals("Natural Log testing [zero]" , app.natural_log(0) , -1 , 0.00001); 
        assertEquals("Natural Log testing [negative]" , app.natural_log(-1) , -1 ,  0.00001); 
    }

    @Test
    public void power()
    {
        assertEquals("Power testing [a , 0]" , app.power(10 , 0) , 1 , 0.00001); 
        assertEquals("Power testing [a , -b]" , app.power(3 , -2) , 0.111111 , 0.00001); 
        assertEquals("Power testing [a , p/q]" , app.power(2 , 3.4) , 10.5560633 , 0.00001); 
    }
}
