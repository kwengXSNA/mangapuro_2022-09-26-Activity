/*
1. Create a program that will continuously ask the user for a selection (menu). Implement these in ArrayList, HashSet, and HashMap implementation
    A. Add number - adds a number to the list/set/map
    B. Remove number - removes a number from the list/set/map
    C. Display numbers - display the numbers added to the list/set/map
    D. Clear numbers - clears the contents added to the list/set/map
    E. Exit

2. Add conditions depending on the implementation of the program
    ArrayList: if the added number is negative, don't allow adding the number and display a message.
    HashSet: If the added number is already present on the HashSet, don't allow adding the number and display a message.
    HashMap: If the added number is a prime number, don't allow adding the number and display a message.

*/
import java.util.*;

public class second_activity {

    //1. Create a program that will continuously ask the user for a selection (menu). Implement these in ArrayList, HashSet, and HashMap implementation
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

//add numbers
        numbers.add (0,1485);
        numbers.add (1,0245);
        numbers.add (2,0000);
        numbers.add (3,1010);

//remove numbers
        numbers.remove(2);

//display numbers
        System.out.println(numbers);

        
    }
}
