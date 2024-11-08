package greeting;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PriorityQueue<String> nicknames = new PriorityQueue<>();
    
    System.out.println("Enter the nicknames of 4 of your classmates: ");
    
    for (int i = 0; i < 4; i++) {
        String names = sc.nextLine();
        nicknames.add(names);
    }
    
    System.out.print("Press H to say Hi to each of them. ");
    
    while(true) {
       char greeting = sc.next().charAt(0);
        
        if (greeting == 'H' || greeting == 'h') {
                if (!nicknames.isEmpty()) {
                    System.out.println("Hi " + nicknames.remove());
                } else {
                    System.out.println("Done saying Hi");
                    break;
                }
            }
        }
    }
}