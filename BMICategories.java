import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double height, weight, x, bmi;

    System.out.print( "\nEnter your height in inches: " );
    height = keyboard.nextDouble();

    System.out.print( "Enter your weight in pounds: ");
    weight = keyboard.nextDouble();

    x = height * 0.0254;
    bmi = weight * 0.453592 / (x * x);

    System.out.println( "\nYour BMI is: " + bmi );

    System.out.print( "Your BMI Category is: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight\n" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight\n" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight\n" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight\n" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight\n" );
    }
    else if ( bmi < 35.0) {
      System.out.println( "moderately overweight\n" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese\n" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese\n" );
    }
  }
}
