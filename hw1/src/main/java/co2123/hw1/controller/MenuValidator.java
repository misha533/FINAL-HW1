package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MenuValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Menu.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Menu m = (Menu) target;

        for (Menu ex : Hw1Application.menus){
            if (m.getId() == ex.getId()){
                errors.rejectValue("id", "", "ID already in use.");
            }

        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "Your menu needs a type");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "restaurant", "", "The restaurant is not specified!");
    }
}
