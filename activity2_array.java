
import java.util.*;


public class activity2_array {
    
    public static void act2 () {
        List<Integer> numbers = new ArrayList<Integer>();
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
                        
                        if (add<1){
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
                    System.out.println("Display Number: " + numbers);
                    System.out.println(" ");

                } else if (pinili == 4){
                    numbers.clear();
                    System.out.println("\n Array Cleared!");
                    System.out.println(" ");

                } else if (pinili == 0){  
                    
                    oks =! true;

                    if (oks =! true) {
                        System.out.println("Are you sure you want to exit?");
                        char top =input.next().charAt(0);
                        top = Character.toUpperCase(top);

                        if (top == 'Y') {
                            oks = true;
                        } else if (top == 'N') {
                            System.out.println("Thank you.");
                            pili = true;
                            System.exit(0);
                        } else {
                            System.err.println("Invalid entry. Try again.");
                        }
    
                    } 

                } else {
                    System.err.println("Not an option");
                    oks =! false;

                    if (oks=! true){
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

    }

   


    public static void main (String[] args) {
        act2();
    }
        



}
