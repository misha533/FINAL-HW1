package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;

public class DishValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Dish.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Dish dish = (Dish) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your dish needs a name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "", "The dish needs a description!");

        if (!isValidDietary(dish.getDietary())) {
            errors.rejectValue("dietary", "", "The dietary field must be 'Vegetarian', 'Vegan', or 'Lactose Free'.");
        }

        // Validate 'price' to be between 15 and 50
        if (dish.getPrice() < 15 || dish.getPrice() > 50) {
            errors.rejectValue("price", "", "The dish price must be between 15 and 50.");
        }
    }

    private boolean isValidDietary(String dietary) {
        return Arrays.asList("Vegetarian", "Vegan", "Lactose Free").contains(dietary);
    }
}



