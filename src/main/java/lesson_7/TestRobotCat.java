package lesson_7;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat mew = new BatteryRobotCat("meo", "19/04/2023");
        System.out.println(mew);
        RobotCat solarRobot = new SolarRobotCat("Solar robot","19/04/2023" );
        System.out.println(mew.charge());
        System.out.println(solarRobot.charge());
    }
}
