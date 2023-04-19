package lesson_6;

public class RobotCat {
    private String name;
    private String year;
    private String color;

    public RobotCat() {
    }

    public RobotCat(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
