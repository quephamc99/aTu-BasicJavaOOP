package lesson_7_1;

public class RobotDog {
    protected static  int dogId=0;

    public RobotDog() {
        dogId++;
    }

    public int getDogId(){
        return dogId;
    }

    public static void changeId(){
        dogId++;
    }
}
