public class Main {
    public static void main(String[] args) {
//        int colorNum = 1;
//
//        switch (colorNum) {
//            case 1:
//                System.out.println("Red");
//                break;
//            case 2:
//                System.out.println("Yellow");
//                break;
//            case 3:
//                System.out.println("Green");
//                break;
//            default:
//                System.out.println("Unsupported value");
//        }
//        String colors = "red";
//        Colors colors1 = Colors.GREEN;
        String colors = Colors.GREEN.name();

        switch (colors) {
            case "RED":
            case "red":
            case "Red":
            case "ReD":
                System.out.println("Stop");
                break;
            case "YELLOW":
            case "yellow":
                System.out.println("Ready");
                break;
            case "GREEN":
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unsupported value");
        }

    }

    enum Colors {
        RED,
        YELLOW,
        GREEN
    }
}