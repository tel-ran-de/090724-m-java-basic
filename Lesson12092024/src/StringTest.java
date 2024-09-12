import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("str1 ------ str2");
        System.out.println("str1 == str2 -> " + (str1 == str2));
        System.out.println("str1.equals(str2) -> " + str1.equals(str2));
        System.out.println("str1 ------ str3");
        System.out.println("str1 == str3 -> " + (str1 == str3));
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
//        System.out.println(Objects.equals(null, null));
        str3 = str3.intern();
        System.out.println("str1 ------ str3");
        System.out.println("str1 == str3 -> " + (str1 == str3));
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        System.out.println("str2 ------ str3");
        System.out.println("str2 == str3 -> " + (str2 == str3));
        System.out.println("str2.equals(str3) -> " + str2.equals(str3));
    }
}
