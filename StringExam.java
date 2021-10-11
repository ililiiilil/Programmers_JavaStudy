public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // string같은 경우만 생성자가 필요없음
        // string의 경우는 hello 라는 상수로서 저장됨
        // hello라는 같은 상수로서 정의될경우, 후에 정의된 건 이전에 정의된 상수를 참조

        if (str1 == str2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (str3 == str4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(str1.substring(3));
    }
}
