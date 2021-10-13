public class MyCal implements Caculator {
    
    public int plus(int x, int y) {
        return x + y;
    }

    public int multiple(int x, int y){
        return x * y;
    }

    // abstract화 안하면 문제가 생기고 추상화 하게 되면
    // 인스턴스화가 안되는게 문제

}
