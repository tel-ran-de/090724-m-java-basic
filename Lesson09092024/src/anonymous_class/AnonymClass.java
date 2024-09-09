package anonymous_class;

public class AnonymClass {
    public static void main(String[] args) {
      Greeting greeting = new Greeting() {
          @Override
          public void sayHello() {
              System.out.println("Hello from anonymous class");
          }
      };
      greeting.sayHello();
    }
}


