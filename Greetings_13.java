import java.util.Scanner;

public class Greetings_13 {

    public static String getGreetingRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the person you want to greet: ");
        String name = sc.nextLine();
        return name; 
    }
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " +name+" may the force be with you!");
    }
    public static void main(String[] args) {
        sayThankyou();
    }
}
