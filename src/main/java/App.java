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
        Scanner sc = new Scanner(System.in); 
        
        while(true){
            System.out.println("1. a + b\n2.a * b\n"); 
            int ch = sc.nextInt(); 
        }
    }
}
