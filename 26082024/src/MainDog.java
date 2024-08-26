public class MainDog {
    public static void main(String[] args) throws Exception {
//        String str;
        Dog dog = new Dog();
//        System.out.println("Name - " + dog.getName() + ", age - " + dog.getAge());
//        System.out.println("-------------------------------------------------\n");
//
        Dog spike = new Dog("Spike", 5);
        System.out.println("Name - " + spike.getName() + ", age - " + spike.getAge());
        System.out.println("-------------------------------------------------");
//
//        Dog tike = new Dog("Tike");
//        System.out.println("Name - " + tike.getName() + ", age - " + tike.getAge());
//        System.out.println("-------------------------------------------------");
//
//        Dog ageDog = new Dog(10);
//        System.out.println("Name - " + ageDog.getName() + ", age - " + ageDog.getAge());
//        System.out.println("-------------------------------------------------\n");

        dog.setName("Tom");
        dog.setAge(10);
        System.out.println("Name - " + dog.getName() + ", age - " + dog.getAge());
        System.out.println("-------------------------------------------------");
//        dog.age = -10;
//        System.out.println(dog.age);


    }
}
