public class MethodClass {
    public static void main(String[] args) {
        String str = "Java";
        printString(str);
//        1
        int result = addInt(2, 5);
        System.out.println("1. Result is " + result);
//        2
        System.out.println("2. Result is " + addInt(2, 5));
        System.out.println(divInt(10, 0));
    }

    public static void printString(String str) {
        System.out.println("You entered: " + str);
    }

    public static int addInt(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int divInt(int numOne, int numTwo) {
        return numOne / numTwo;
    }
}
