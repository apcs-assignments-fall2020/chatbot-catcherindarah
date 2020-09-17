import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Nice to meet you, " + name);
        
        System.out.print("What is your favorite color? ");
        String color = scan.next();
        System.out.println("Oh I like " + color + "too!");
        scan.close();
    }
}
