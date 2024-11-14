package co2123.hw1.domain;

public class Dish {
    private String name;
    private String description;
    private String dietary;
    private int price;


    public Dish() {
    }

    // Constructor
    public Dish(String name, String description, String dietary, int price) {
        this.name = name;
        this.description = description;
        this.dietary = dietary;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDietary() {
        return dietary;
    }

    public void setDietary(String dietary) {
        this.dietary = dietary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
