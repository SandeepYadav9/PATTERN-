/**
 * Pattern
 */

//  ****
//  ***
//  ** 
//  *
public class Pattern {

    public static void main(String[] args) {
       
       int n=5;
        // Outer Loops
        for(int i=n; i>=0; i--){
            for(int j=1; j<=i; j++){
                // Inner Loops            
                    System.out.print(" *");                
                
            }
            System.out.println();
        }
         }
}