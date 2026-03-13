
package cmtoinchconverter;
import java.util.Scanner;

public class CmToInchConverter {

    
    public static void main(String[] args) {
    Scanner inp=new Scanner (System.in);
     System.out.print("Enter the length in centimeters: ");
        double cm = inp.nextDouble();

        double inch = cm / 2.54;

        System.out.println("The length in inches is: " + inch);
   
        
    }
    
}
