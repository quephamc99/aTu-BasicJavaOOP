package lesson_7;

import java.util.Arrays;
import java.util.List;

public class RobotController {
    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat mew = new BatteryRobotCat("meo", "19/04/2023");
        RobotCat solarMew = new SolarRobotCat("Solar robot","19/04/2023" );
        robotController.charge(Arrays.asList(mew, solarMew));
    }

    public void charge(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
