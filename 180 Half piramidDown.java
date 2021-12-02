/**
 * Pattern ******
 *         ******
 *         ******
 *         ******
 */
public class Pattern {

    public static void main(String[] args) {
       
       int n=5;
       // Outer Loops
        for(int i=n; i>=1; i--){ 

            //Inner Loops for Space
          for(int j=1 ; j<=n-i ; j++){
              System.out.print(" ");
          }
            // Inner loops for prints
            for(int j=1; j<=i; j++){
                System.out.print("*");                 
                
            }
            System.out.println();
        }
         
        }}