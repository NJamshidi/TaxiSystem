package taxiSystem.model.vehicle;

public class Vehicle {
    private int id;
    private String name;
    private String color;
    private String number;

    public Vehicle(int id, String name, String color, String number) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
