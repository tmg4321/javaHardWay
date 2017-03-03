public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, z, age;
    double seconds, e, checking, interest;
    String firstName, lastName, title, occupation, role;

    x = 10;
    y = 400;
    z = 500;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    interest = 9.05;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    occupation = "Writer";
    role = "Educator";

    System.out.println( "\nThe variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The value of " + z + " is stored in the variable z.");
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " +e );
    System.out.println( "Hopefulluy you have more than $" + checking + "!");
    System.out.println( interest + "% is too high a rate for financing!");
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( occupation + ", " + role );
    System.out.println();
  }
}
