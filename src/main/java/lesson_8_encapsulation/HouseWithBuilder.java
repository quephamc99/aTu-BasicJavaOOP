package lesson_8_encapsulation;

public class HouseWithBuilder {
    private int doorNum =1;
    private String topRootColor= "red";
    private String color ="white";

    public HouseWithBuilder() {
    }

    protected HouseWithBuilder(Builder builder){
        this.doorNum = builder.doorNum;
        this.topRootColor = builder.topRootColor;
        this.color= builder.color;
    }
    // READ ONLY


    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRootColor() {
        return topRootColor;
    }

    public String getColor() {
        return color;
    }


    //Customer service | Inner class
    public static class Builder{
        private int doorNum =1;
        private String topRootColor= "red";
        private String color ="white";

        //WRITE ONLY  --> generate Setter only

        public void setDoorNum(int doorNum) {
            this.doorNum = doorNum;
        }

        public void setTopRootColor(String topRootColor) {
            this.topRootColor = topRootColor;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }
}
