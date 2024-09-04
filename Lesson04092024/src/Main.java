public class Main {
    public static void main(String[] args) {
//        for(int i = 1; i < 6; i++) {
//            System.out.println("i = " + i);
//        }
//        System.out.println();
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

//        for and foreach compare
//        String str = "Hello Java!";
//        System.out.println("Regular for");
//        for(int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i));
//        }
//
//        System.out.println("\n\nForeach");
//        for (char ch : str.toCharArray()) {
//            System.out.print(ch);
//        }
//        System.out.println();

//        infinite loop
//        1
//        for (int i = 1; i >= 1; i++) {
//            System.out.println(i);
//            System.out.println("Java");
//        }

//        2
//        for (;;) {
//            System.out.println("infinite loop");
//        }

//        infinite loop with exit condition
//        for (int i = 1; i >= 1; i++) {
//            System.out.println(i);
//            System.out.println("Java");
//            if (i == 1000) {
//                break;
//            }
//        }

//        int j = 0;
//        for (;;) {
//            System.out.println("infinite loop");
//            if (j == 1000) {
//                System.out.println("You entered too many fail values.");
//                break;
//            }
//            j++;
//        }

//        for(int i = 2; i < 6; i++) {
//            for (int j = 2; j < 6; j++) {
//                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
//            }
//            System.out.println();
//        }

//        System.out.print("Hello ");
//        System.out.println("Java");
//        System.out.println("New line");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}