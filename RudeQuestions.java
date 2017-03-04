import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, favorite;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "\nHello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "What's your income, " + name + "?" );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour " );
    System.out.println( "and not per year!" );
    System.out.print( "Tell me, what's your favorite color?" );
    favorite = keyboard.next();

    System.out.println( favorite + ", eh? I love purple!");
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );
    System.out.println();
  }
}
// No. Integers don't violate floating-point expectation; 1 = 1.0
// No. No. Numeric values don't violate String expectation; 1 is a character
// Question 1 blows up if I type two words, but suspect that's becuase
// the second word is entered as an answer to qeustion 2; otherwise, I cannot
// blow up Question 1
// Question 2 blows up if I enter a fractional number; e.g. 1.1 is not an Integers
// Question 3 blows up if i enter a word; e.g. one-seventy is not a floating-point number
// Question 4; same answer as Question 3
