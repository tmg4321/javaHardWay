import java.util.Scanner;

public class RunningTotal {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int current = 1, total = 0;

    System.out.print("\nType in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");

    do {
        System.out.print("\nValue: ");
        current = keyboard.nextInt();
        total += current;
        if ( current != 0 ) {
          System.out.println("\nThe TOTAL so far is: " + total);
        }
    } while ( current != 0 );

    System.out.println("\nThe final TOTAL is: " + total + "\n");
  }
}
