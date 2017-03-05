public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestlist = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestlist || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("\nYou are allowed to enter the club.\n");
    }
    else {
      System.out.println("\nYou are NOT allowed to enter the club.\n");
    }
  }
}
