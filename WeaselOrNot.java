import java.util.Scanner;

public class WeaselOrNot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "\nType the word \"weasel\", please." );
    word = keyboard.next();

    yep = word.equals("weasel");
    nope = ! word.equals("weasel");

    System.out.println( "\nYou typed what was requested: " + yep );
    System.out.println( "You ignored polite intructions: " + nope );
    System.out.println();
  }
}
