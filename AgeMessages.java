import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "\nHow old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook account" );
    }
    if ( age >= 13 ) {
      System.out.println( "\told enough to open a Facebook account" );
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if ( age >= 16 ) {
      System.out.println( "\told enough to drive" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tattoo" );
    }
    if ( age >= 18 ) {
      System.out.println( "\told enough get a tattoo" );
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\told enough for a martini");
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for President of the U.S." );
      System.out.println( "\t\t(Sad!)" );
    }
    if ( age >= 35 ) {
      System.out.println( "\told enough to run for President of the USA");
    }
    if ( age <= 65 ) {
      System.out.println( "\ttoo young to retire\n" );
    }
    if ( age > 65 ) {
      System.out.println( "\told enough to retire!\n" );
    }
  }
}
