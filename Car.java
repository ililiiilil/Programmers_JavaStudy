 public class Car {
    //타입 변수명 필드명
    String name;
    int number;

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }

    public Car(){
        
    }

    public Car(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("달리다.");
    }
}
