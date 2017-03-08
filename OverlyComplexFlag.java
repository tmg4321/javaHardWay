import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main( String[] args ) {
    printTopHalf();

    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();

    printPledge();
  }

  public static void print48Colons() {
    out.println( "|::::::::::::::::::::::::::::::::::::::::::::::::|" );
  }

  public static void print48Ohs() {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print29Colons() {
    out.println( "|:::::::::::::::::::::::::::::|" );
  }

  public static void printPledge() {
    out.println( "\nI pledge allegiance to the flag.\n" );
  }

  public static void print29Ohs() {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print6Stars() {
    out.print( "| *  *  *  *  *  * " );
  }

  public static void print5Stars() {
    out.print( "|   *  *  *  *  *  " );
  }

  public static void printSixStarLine() {
    print6Stars();
    print29Ohs();
  }

  public static void printFiveStarLine() {
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf() {
    out.println( " ________________________________________________" );
    // above line has 1 space then 48 underscores between the quotes
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }
}
