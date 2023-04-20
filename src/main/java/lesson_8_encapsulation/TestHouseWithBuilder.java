package lesson_8_encapsulation;
import static lesson_8_encapsulation.HouseWithBuilder.Builder;
public class TestHouseWithBuilder {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setDoorNum(3);
        builder.setTopRootColor("pink");
        builder.setColor("green");

        builder.build();
    }


}
