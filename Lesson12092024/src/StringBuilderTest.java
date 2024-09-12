public class StringBuilderTest {
    public static void main(String[] args) {
//        StringBuilder sb1 = new StringBuilder();
        String str = "Java";
        StringBuilder sb2 = new StringBuilder(str);
//        System.out.println(sb1);
        System.out.println(sb2);
        String addStr = " for beginners";
        sb2.append(addStr);
        System.out.println(sb2);
//        System.out.println("capacity = " + sb2.capacity());
//        System.out.println("length = " + sb2.length());
//        sb2.append("!!!!!");
//        System.out.println("capacity = " + sb2.capacity());
//        System.out.println("length = " + sb2.length());

//        StringBuilder sql = new StringBuilder("SELECT * FROM");
//        sql.append(" Employee");
//        System.out.println(sql);
//        sql.append(" AS emp\nINNER JOIN Address addr ON emp.id = addr.emp_id AND emp.city like '%NY%");
//        System.out.println(sql);
//        System.out.println(sb2.charAt(0));
        StringBuilder sb3 = new StringBuilder(sb2.substring(0, sb2.length()));
        StringBuilder sb3Copy = new StringBuilder(sb2);
        sb3.reverse();
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb3Copy);
        sb3.delete(10, 14);
        System.out.println(sb3);
        sb3.deleteCharAt(0);
        System.out.println(sb3);

//        System.out.println(sb2.substring(5, 8));
    }
}
