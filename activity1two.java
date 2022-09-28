import java.util.*;

public class activity1two {

    public static void main(String[] args) {
        Set <Integer> sets = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");
        int a = input.nextInt();
        sets.add(a);

        System.out.println("What is your birthyear? ");
        int b = input.nextInt();
        sets.add(b);

        System.out.println("How old is Chanyeol? ");
        int c = input.nextInt();
        sets.add(c);

        System.out.println("How long is EXO on stage as a band? ");
        int d = input.nextInt();
        sets.add(d);

        System.out.println("On what year did they debut as a band? ");
        int e = input.nextInt();
        sets.add(e);

        Iterator<Integer> it = sets.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
