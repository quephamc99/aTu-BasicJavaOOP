package lesson_8_encapsulation;

public class House {
    private int doorNum =1;
    private String topRootColor= "red";
    private String color ="white";

    public House() {
    }

    public House(int doorNum, String topRootColor, String color) {
        if(doorNum !=1 && doorNum >0){
            this.doorNum = doorNum;
        }
        if(topRootColor !=null) {
            this.topRootColor = topRootColor;
        }
        if(color!=null) {
            this.color = color;
        }
    }


    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void setTopRootColor(String topRootColor) {
        this.topRootColor = topRootColor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        House house = new House();
        house.setDoorNum(3);
        house.setTopRootColor("pink");
    }

    //immutable object
}
