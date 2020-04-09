package hello;

import java.util.Scanner;  // Import the Scanner class
import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Enter name");

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String name = input.nextLine();  // Read user input

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello(name));
    }
}
