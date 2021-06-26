public class Test {


    public static String padLeft(String origin, int length, String ch) {
        while (origin.length() < length) {
            origin = String.format("%s%s", ch, origin);
        }
        return origin;
    }

    public static String padRight(String origin, int length, String ch) {
        while (origin.length() < length) {
            origin = String.format("%s%s", origin, ch);
        }
        return origin;
    }


    public static void main(String[] args) {
        System.out.println(padRight("你好:", 5, "\u3000"));
    }
}
