public class MyclassExam {
    
    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        myclass.method1();
        myclass.method2(10);

        int x = myclass.method3();
        System.out.println(x);

        myclass.method4(10, 20);
        int y = myclass.method5(30);
        System.out.println(y);
    }
}
