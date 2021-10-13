public class InnerTest3 {
    
    public void exec(){
        class Cal{
            int value = 0;
            public void plus(){
                value++;
        }
    }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
    public static void main(String[] args) {
        InnerTest3 t = new InnerTest3();
        t.exec();
        
    }
}
