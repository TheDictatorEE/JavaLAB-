import java.util.Scanner;

public class StartEndCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the word to check start with: ");
        String start = sc.nextLine();
        System.out.print("Enter the word to check end with: ");
        String end = sc.nextLine();

        if (str.startsWith(start) && str.endsWith(end))
            System.out.println("String starts with '" + start + "' and ends with '" + end + "'");
        else
            System.out.println("String does not start and end with specified words");
    }
}
