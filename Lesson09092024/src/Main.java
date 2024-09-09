import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Dog tom = new Dog("Tom", 5);
//        Dog dog1 = new Dog();
//        System.out.println("tom");
//        System.out.println(tom.getAge());
//        System.out.println(tom.getName());
//        System.out.println("dog1");
//        System.out.println(dog1.getAge());
//        System.out.println(dog1.getName());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        System.out.println("Enter a age:");
        int age = sc.nextInt();
        Dog dog1 = new Dog(name, age);

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        dog1.sound();
//        dog.setAge(5);
//        dog.setName("Tom");
//        System.out.println(dog.getAge());
//        System.out.println(dog.getName());
    }
}