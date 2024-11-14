package co2123.hw1.domain;


import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int id;
    private String type;
    private String restaurant;
    private List<Dish> dishes ;

    public Menu() {}

    public Menu(int id, String type, String restaurant, List<Dish> dishes) {
        this.id = id;
        this.type = type;
        this.restaurant = restaurant;
        this.dishes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
