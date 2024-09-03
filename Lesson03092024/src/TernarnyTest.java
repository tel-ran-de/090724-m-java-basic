public class TernarnyTest {
    public static void main(String[] args) {
//        int num = 4;
//
//        if (num % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//
//        String result = num % 2 == 0 ? "Even" : "Odd";
//        System.out.println(result);

        int numOne = 5;
        String result = numOne > 0 ? (numOne > 5 ? (numOne < 10 ? "< 10" : ">= 10") : "<= 5") : "less than or equals 0";
        System.out.println(result);

        if (numOne > 0) {
            if (numOne > 5) {
                if (numOne < 10) {
                    System.out.println("< 10");
                } else {
                    System.out.println(">= 10");
                }
            } else {
                System.out.println("< 5");
            }
        } else {
            System.out.println("less than or equals 0");
        }
    }
}
