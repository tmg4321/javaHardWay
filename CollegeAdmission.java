import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println( "\nWelcome to the UT Austin College Admissions Interface!" );
    out.print( "\nPlease enter your SAT math score (200-800): " );
    math = keyboard.nextInt();

    out.print( "\nAdmittance status: " );

    if ( math >= 790 )
      out.print( "CERTAIN" );
    else if ( math >= 710 )
      out.print( "SAFE" );
    else if ( math >= 580 )
      out.print( "PROBABLE" );
    else if ( math >= 500 )
      out.print( "UNCERTAIN" );
    else if ( math >= 390 )
      out.print( "UNLIKELY" );
    else // below 390
      out.print( "DENIED" );
    out.println();
  }
}
