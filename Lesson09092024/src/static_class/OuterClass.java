package static_class;

public class OuterClass {
    static class InnerClass {
        public static void print() {
            System.out.println("Hello from StaticClass");
        }
        public void printInfo() {
            System.out.println("Hello from StaticClass not static method");
        }

        public String returnInfo() {
            return "Hello from StaticClass not static method with return";
        }
    }
}
