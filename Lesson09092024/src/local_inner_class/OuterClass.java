package local_inner_class;

public class OuterClass {
    public void printInfo() {
        class LocalClass {
            public void print() {
                System.out.println("Hello from Local class");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.print();
    }
}
