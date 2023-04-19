package lesson_7;

public class SolarRobotCat extends RobotCat{
    public SolarRobotCat() {
    }

    public SolarRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public String charge(){
        return super.charge() + " with solar energy!";
    }
}
