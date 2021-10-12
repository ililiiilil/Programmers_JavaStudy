public class VariableScope {
    int globalScope = 10;
    static int StacticVal = 20;

    public void scopeTest(int value){
        int localScope = 20;
        
        System.out.println(localScope);
        System.out.println(globalScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        //System.out.println(localScope);
        //System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        //System.out.println(localScope);
        //System.out.println(globalScope);
        //System.out.println(value);
        System.out.println(StacticVal);

        VariableScope v1 = new VariableScope();
        System.out.println(v1.globalScope);

        VariableScope v2 = new VariableScope();
        v1.globalScope = 15;
        v2.globalScope = 25;

        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        v1.StacticVal = 50;
        v2.StacticVal = 100;

        //클래스 변수의 경우는 인스턴스로 사용하지말고 클래스명.으로사용하기!

        System.out.println(v1.StacticVal);
        System.out.println(v2.StacticVal);
    }
}
