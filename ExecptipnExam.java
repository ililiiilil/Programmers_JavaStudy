public class ExecptipnExam {
    public static void main(String[] args) {
        int i = 3;
        int j = 0; 
        try {
            int k = i / j;
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌수 없습니다."+ e.toString());
        }finally{
            System.out.println("finally");
        
    }
}
