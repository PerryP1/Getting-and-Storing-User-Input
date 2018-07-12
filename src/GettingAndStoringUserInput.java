import java.util.Scanner;

public class GettingAndStoringUserInput {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your first initial?");
        String first_Initial  = keyboard.next();

        System.out.println("What is your last initial?");
        String last_Initial  = keyboard.next();

        System.out.println("What is your last house number?");
        int house_Number  = keyboard.nextInt();

        System.out.println("What is your street name?");
        String street_Name  = keyboard.next();

        System.out.println("What is your street type?");
        String street_Type  = keyboard.next();

        System.out.println("What is your city?");
        String city  = keyboard.next();

        System.out.print(first_Initial + " " + last_Initial + " " + house_Number + " ");
        System.out.println(street_Name + " " + street_Type + " " + city);

    }
}
