import java.util.Scanner;

/**
 * Created by mdb17 on 3/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your function...Please use X as your variable and use ^ to denote exponents");
        String func = input.nextLine();
        System.out.println("Your derivative is: ");
        one.solve(func);
    }
}
