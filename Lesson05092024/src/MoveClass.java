import java.util.Scanner;

public class MoveClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int number = sc.nextInt();
        System.out.println("Enter how much to shift the category of number...");
        int numberShift = sc.nextInt();

        String tmp = "";
        String textCycle = "";
        int i;

        for (int x = 0; x < numberShift - 1; x++) {

            i = number % 10;
            tmp = i + tmp;
            number = number / 10;

        }
        textCycle = tmp + number;
        System.out.println(textCycle);
    }

    // num = 12345 -> tmp = 5, num = 1234 -> tmp = 45 num = 123 => 45123
}
