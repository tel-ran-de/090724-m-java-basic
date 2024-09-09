package inner_class;

public class MainClass {
    public static void main(String[] args) {
        String str = "Some text";
        OuterClass outerClass = new OuterClass(str);
        outerClass.callInnerClassMethod();
    }
}
