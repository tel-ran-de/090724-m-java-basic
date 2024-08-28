import homework1.HomeWorkClass;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int numIntOne = 5;
        int numIntTwo = 10;
        double numDoubleOne = 5.5;
        double numDoubleTwo = 4.5;
        print();
        System.out.println(HomeWorkClass.sum(numDoubleOne, numDoubleTwo));
        int resultInt = HomeWorkClass.sum(numIntOne, numIntTwo);
        System.out.println(resultInt);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }

    public static void print() {
        System.out.println("Test class");
    }
}
