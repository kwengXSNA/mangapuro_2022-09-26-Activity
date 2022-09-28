import java.util.*;


public class Main {
    /*1st Activity

1. implement an ArrayList and HashSet
2. Ask for user input 5 times, and then add the values into the ArrayList and HashSet
3. Display the values in the arraylist and HashSet.
4. Create repository for github and push the code. */



    public static void main(String[] args) {

        
        List<String> details = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("NAME: ");
        String d = input.nextLine();
        details.add(d);
        
        System.out.println("NICKNAME: ");
        String d1 = input.nextLine();
        details.add(d1);

        System.out.println("RESIDENCY: ");
        String d2 = input.nextLine();
        details.add(d2);

        System.out.println("HOBBIES: ");
        String d3 = input.nextLine();
        details.add(d3);

        System.out.println("FAVORITES: ");
        String d4 = input.nextLine();
        details.add(d4);

        /*System.out.println(details.toString());*/

        Iterator<String> i=details.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }
    }
  
}
