import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;

    System.out.print("\nIf you give me a number, I'll find it's square root. " );
    System.out.print("\nAre you ready (Yes/No)? > ");
    String ready = keyboard.next();

    while ( ! ready.equals("Yes")) {
      System.out.println("\nType \"Yes\" if you're ready.");
      System.out.print("Otherwise we'll be here all day :-) So, are you ready? ");
      ready = keyboard.next();

    }
    System.out.print("\nGreat! Ok, give me a number!");
    System.out.print( " (No Negatives, please.) > ");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("\nI won't take the square root of a negative." );
      System.out.print("\nPlease enter a positive number: " );
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("\nThe square root of " + x + " is " + y +"\n" );
  }
}
