package static_class;

public class MainClass {
    public static void main(String[] args) {
//        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass.print();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.printInfo();

        String info = innerClass.returnInfo();
        System.out.println(info);

        System.out.println(innerClass.returnInfo());
    }
}
