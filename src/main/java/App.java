/**
 * Hello world!
 *
 */

import java.util.Scanner; 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger log = LogManager.getLogger(App.class); 
    public static double sqrt(double n){
        if(n<0){
            System.out.println("Invalid input for square root"); 
            log.info("Invalid input for sqrt(n)"); 
            return -1;
        }   

        double ans = Math.sqrt(n); 
        
        log.info("Answer of sqrt(" + n + ") is " + ans); 
        return ans;  
    }

    public static double fact(double n)
    {
        if(n < 0){
            System.out.println("Invalid input for factorial"); 
            log.info("Invalid input n!"); 
            return -1; 
        }

        double ans = 1; 
        for(int i = 1; i<=n; i++)
        {
            ans *= i; 
        }

        log.info("Answer of " + n + "! is " + ans); 
        return ans; 
    }

    public static double natural_log(double n)
    {
        if(n <= 0)
        {
            System.out.println("Invalid input for natural log"); 
            log.info("Invalid input nl"); 
            return -1; 
        }

        double ans = Math.log(n); 
        log.info("Natural Log for " + n + " is " + ans); 
        return ans; 
    }

    public static double power(double base , double pow)
    {
        double ans = Math.pow(base , pow); 
        log.info("Base " + base + " raised to the power " + pow + " is " + ans); 
        return ans; 
    }

    public static void main( String[] args )
    {   
        Scanner sc = new Scanner(System.in); 
        
        while(true){
            System.out.println("1. Square Root (n)");
            System.out.println("2. Factorial (n!)"); 
            System.out.println("3. Natural Log ln(n)"); 
            System.out.println("4. Power (a , b)");  
            System.out.println("5. exit"); 
            int ch = sc.nextInt(); 
            System.out.println("Enter the number(s) : "); 
            double n, a, b, ans; 
            switch(ch)
            {
                
                case 1:
                n = sc.nextInt(); 
                ans = sqrt(n); 
                System.out.println("Ans : " + ans); 
                break; 

                case 2: 
                n = sc.nextInt(); 
                ans = fact(n); 
                System.out.println("Ans : " + ans); 
                break; 

                case 3: 
                n = sc.nextInt(); 
                ans = natural_log(n); 
                System.out.println("Ans : " + ans); 
                break; 

                case 4: 
                a = sc.nextInt(); 
                b = sc.nextInt(); 
                ans = power(a , b); 
                System.out.println("Ans : " + ans); 
                break; 
                
                case 5: 
                System.exit(0); 
            }
        }
    }
}
