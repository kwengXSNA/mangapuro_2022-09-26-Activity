
import java.util.*;

public class Main {
    public static void main(String[] args) {
     
        /*  1st create Main class, create another class for an object
            2nd Define the class with a generic data type.
            3rd Initialize the class with a value 
            4th Print out value */
        // List mcd = new ArrayList<String>();

        Pips<String> pip1 = new Pips<String>();
        
        pip1.setObj("Christina");
        System.out.println(pip1.getObj());

        Pips<Friends> pip2 = new Pips<Friends>();
        

    }
}
