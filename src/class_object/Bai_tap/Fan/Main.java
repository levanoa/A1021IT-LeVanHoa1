package class_object.Bai_tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan(1,5,"read",true);
        System.out.println(fan.getSpeed());
//        System.out.println(fan.toString());
        fan.setSpeed(5);
        System.out.println(fan);

//        Fan fan1 =new Fan();
    }
}
