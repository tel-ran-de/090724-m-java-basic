public class Dog {
    private String name;
    private int age;

//    default constructor
    public Dog() {}

//    full params constructor
    public Dog(String name, int age) {
        this.name = name;
        if (age >= 0 && age < 16) {
            this.age = age;
        } else {
            System.out.println("Current age doesn't support");
        }
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        if (age >= 0 && age < 16) {
            this.age = age;
        } else {
            System.out.println("Current age doesn't support");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age >= 0 && age < 16) {
            this.age = age;
        } else {
//            System.out.println("Current age doesn't support");
            throw new Exception("Current age doesn't support");
        }
    }
}
