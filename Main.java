import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {

        if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
            result.append(str.charAt(i));
        }
    }

    System.out.println("Result: " + result);

    sc.close();
}

}