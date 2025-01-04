package rtemonk.springframework.recipeproject.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import rtemonk.springframework.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Slf4j
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final RecipeService recipeService;

    @GetMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        log.debug("getIndexPage before setting attribute to model");
        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug("getIndexPage after setting attribute to model");
        return "index";
    }
}
