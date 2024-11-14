package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class DishController {

    @RequestMapping("/dishes")
    public String dishes(@RequestParam int menu, Model model) {
        Menu targetMenu = null;


        for (Menu m : Hw1Application.menus) {
            if (m.getId() == menu) {
                targetMenu = m;
                break;
            }
        }

        if (targetMenu != null) {
            model.addAttribute("dishes", targetMenu.getDishes());
            model.addAttribute("menu", targetMenu.getId());
        }

        return "dishes/list";
    }


    @RequestMapping("/newDish")
    public String newDish(@RequestParam int menu, Model model) {

        model.addAttribute("menu", menu);
        model.addAttribute("dish", new Dish());

        return "dishes/form";
    }


    @RequestMapping("/addDish")
    public String addDish(@Valid @ModelAttribute Dish dish, BindingResult result, @RequestParam int menu, Model model) {
        Menu targetMenu = null;
        if (result.hasErrors()) {
            return "menus/form";
        }


        for (Menu m : Hw1Application.menus) {
            if (m.getId() == menu) {
                targetMenu = m;
                break;
            }
        }

        if (targetMenu != null) {
            targetMenu.getDishes().add(dish);
        }
        model.addAttribute("menu", menu);
        return "redirect:/menus";
    }
}
