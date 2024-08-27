import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
//        1
//        System.out.println((int)(Math.random() * 10) + 10);
//        (int) (Math.random() * (max - min + 1)) + min
//        int min = 50;
//        int max = 100;
//        System.out.println((int) (Math.random() * (max - min + 1)) + min);
//        2
        Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(11));
        System.out.println(rand.nextInt(11) + 10); // min = 0 + 10;(10) max = 10 + 10;(20)
    }
}
