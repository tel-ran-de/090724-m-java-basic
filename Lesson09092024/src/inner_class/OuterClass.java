package inner_class;

public class OuterClass {
    private String text ;

    public OuterClass(String text) {
        this.text = text;
    }

    class InnerClass {
        public void printText() {
            System.out.println(text);
        }
    }

    public void callInnerClassMethod() {
        InnerClass innerClass = new InnerClass();
        innerClass.printText();
    }
}
