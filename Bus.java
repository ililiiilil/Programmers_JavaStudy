public class Bus extends Car {
    public void ppang(){
        System.out.println("빵빵");
    }

    @Override
    public void run(){
        super.run();
        System.out.println("bus의 run method");
    }
}
