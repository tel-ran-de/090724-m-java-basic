import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        equals
        Dog spike = new Dog("Spike", 5);
        Dog dog = null;
        int i = 10;
        int j = 11;
        Objects.equals(spike, dog);
//        spike.equals(dog);
//        dog.equals(spike);

//        exception
//        null.equals();

    }
}