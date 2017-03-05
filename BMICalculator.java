import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double feet, inches, pounds, x, bmi;

    System.out.print( "\nYour height (feet only): " );
    feet = keyboard.nextDouble();

    System.out.print( "Your height (remaining inches): ");
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    x = (feet*12+inches)*0.0254;
    bmi= pounds*0.453592 / (x*x);

    System.out.println( "Your BMI is " + bmi );
    System.out.println();
  }
}
