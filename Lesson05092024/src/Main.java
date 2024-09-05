public class Main {
    public static void main(String[] args) {
        int diagonal = 10;
        int height = diagonal / 2;

//        upper
        for (int j = 0; j <= height; j++) {
            for (int i = 0; i <= diagonal; i++) {
                if (i <= height + j && i >= height - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//      down
        for (int j = height; j < diagonal; j++) {
            for (int i = 0; i < diagonal; i++) {
                if (i <= height + diagonal - j - 1 && i >= j - height + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

        System.out.println();

//        up
        for (int j = 0; j <= height; j++) {
            for (int i = 0; i <= diagonal; i++) {
                if (i == height + j || i == height - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
//        down
        for (int j = height; j < diagonal; j++) {
            for (int i = 0; i < diagonal; i++) {
                if (i == height + diagonal - j - 1 || i == j - height + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}