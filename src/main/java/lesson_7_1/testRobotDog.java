package lesson_7_1;

public class testRobotDog {
    public static void main(String[] args) {
        RobotDog solarDog = new SolarRobotDog();
        RobotDog.changeId();
        RobotDog windyDog = new SolarRobotDog();
        System.out.println(solarDog.getDogId());
        System.out.println(windyDog.getDogId());

    }
}
