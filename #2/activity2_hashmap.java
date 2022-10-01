
import java.util.*;

public class activity2_hashmap {

    public static boolean isPrime (int in) {
        if (in<2)
            return false;

        for (int i = 2; i<= Math.sqrt(in); i++) {
            if (in % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void act2 () {
            Map<Integer, String> numbers = new HashMap<Integer, String>();
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
                            System.out.println("Add Value: ");
                            String addval = input.next();
    
                            while (true) {
                                
                                if (isPrime(add)){
                                    System.out.println("It's a prime number.");
                                    System.out.println(" ");
                                    System.out.println("Add Number: ");
                                    add = input.nextInt();
                                    System.out.println("Add Value: ");
                                    addval = input.next();
                                } else {
                                    numbers.put(add,addval);
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
                                System.exit(0);
            
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
    
