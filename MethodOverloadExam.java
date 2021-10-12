public class MethodOverloadExam {
    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(2, 3));

        System.out.println(m.plus(2, 3,4 ));

        System.out.println(m.plus("Hello", " wolrd!"));
    }
}