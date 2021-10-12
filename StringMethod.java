public class StringMethod {
    public static void main(String[] args) {
        String str = new String("Hello");
        String str1 = "hello";

        System.out.println(str.length());
        System.out.println(str1.length());

        System.out.println(str1.concat(" world"));
        System.out.println(str1.substring(2, 3));

    }
}
