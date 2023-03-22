import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Do you really expect me to believe that your name is " + name + "?");

    }
}