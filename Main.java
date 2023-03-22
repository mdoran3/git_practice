import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //instantiate scanner
        
        System.out.println("What is your name? "); //take in user input
        String name = in.nextLine().trim();
        System.out.println("Do you really expect me to believe that your name is " + name + "?");

        System.out.println("What is your favorite food? "); //take in user input
        String faveFood = in.nextLine().trim();
        System.out.println(faveFood + " is also my favorite!");

        in.close(); //close Scanner
    }
}