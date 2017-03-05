import java.util.Scanner;

public class SecretWord {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;

    System.out.print( "\nWhat's the secret word? " );
    guess = keyboard.next();

    if ( guess.equals(secret) || guess.equals("abracadabra") ) {
      System.out.println( "That's correct!\n" );
    }
    else {
      System.out.println( "No, the secret word isn't \"" + guess + "\".\n" );
    }

    if ( guess == secret ) {
      System.out.println( "This will never ever show, no matter what.)" );
    }
  }
}
