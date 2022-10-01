/* 2nd Activity

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

__________________________________________________________________________________________________________________________________________________________

Create a git repository (individual) and push your code into the repository. The repository should contain 2 files for activity-1 and 3 files for activity-2(1 for ArrayList, 1 for HashSet, 1 for HashMap) . Submit your repository link here.

 */

import java.util.*;

public class activity2_hashset {
    public static void act2 () {
        Set<Integer> numbers = new HashSet<Integer>();
        try (Scanner input = new Scanner(System.in)) {
            boolean pili = true;
            boolean oks = true;


            while (pili==true) {

                while(oks==true){
                    System.out.println("MENU \n [1] Add Number \n [2] Remove Number \n [3] Display Number \n [4] Clear Numbers \n (0) Exit");

                    System.out.println("Key in your choice: ");
                    int pinili = input.nextInt();

                    if (pinili == 1) {
                        System.out.println("Add Number: ");
                        int add = input.nextInt();

                        while (true) {
                            
                            if (numbers.contains(add)){
                                System.out.println("I don't take a negative number.");
                                System.out.println(" ");
                                System.out.println("Add Number: \n");
                                add = input.nextInt(); 
                            } else {
                                numbers.add(add);
                                System.out.println("Added!");
                                break;
                            }
                        }
                    } else if (pinili == 2) {
                        System.out.println("Enter a Number to Remove: ");
                        int remove = input.nextInt();

                        numbers.remove(Integer.valueOf(remove));
                        System.out.println(" ");

                    } else if (pinili == 3) {
                        System.out.println(numbers);
                        System.out.println(" ");

                    } else if (pinili == 4){
                        numbers.clear();
                        System.out.println("\n Cleared!");
                        System.out.println(" ");

                    } else if (pinili == 0){  
                        
                            System.out.println("Thank you.");
                            System.out.println(0);

        
                    } else {
                        System.out.println("Not an option");
                            System.out.println("Would you like to run again? Y/N");
                            char top = input.next().charAt(0);
                            top = Character.toUpperCase(top);

                            if (top == 'Y' || top == 'y') {
                                oks = true;
                            } else if (top == 'N' || top == 'n'){
                                System.out.println("Thank you.");
                                pili = true;
                                System.exit(0);
                            } else {
                                System.err.println("Invalid entry. Try again.");
                            }
                        }
                    }
                }

            
            }
        }


   


    public static void main (String[] args) {
        act2();
    }
        
}
