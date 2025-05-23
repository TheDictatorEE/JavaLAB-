import java.util.Scanner;

public class FindOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to find: ");
        char ch = sc.next().charAt(0);

        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
