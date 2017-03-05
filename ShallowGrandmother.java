import java.util.Scanner;

public class ShallowGrandmother {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.print( "\nEnter your age: " );
    age = keyboard.nextInt();

    System.out.print( "Enter your yearly income: " );
    income = keyboard.nextDouble();

    System.out.print( "How cute are you, on a scale of 1.0 to 10.0?  " );
    cute = keyboard.nextDouble();

    System.out.print( "On a 1.0 to 10.0 scale, how happy do you make my grandbaby?  " );
    happy = keyboard.nextDouble();

    allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

    allowed2 = ( age >= 35 && age <= 40 && ( happy >= 7.0 ) );

    System.out.println( "\nAllowed to date grandbaby, based on age & cutness? " + allowed );
    System.out.println();
    System.out.println( "Allowed to date grandbaby, based on age & happiness? " + allowed2 );
    System.out.println();
  }
}
