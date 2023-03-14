/**
 * Hello world!
 *
 */

import java.util.Scanner; 

public class App 
{
    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1; 
        }

        return n * fact(n-1); 
    }

    public static void main( String[] args )
    {   
        // Scanner scn = new Scanner(System.in); 
        // System.out.println("Enter a number : "); 
        // int n = scn.nextInt(); 
        int n = 10; 
        System.out.println(fact(n)); 
    }
}
