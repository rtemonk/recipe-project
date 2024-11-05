package skn.springframework.recipeproject.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import skn.springframework.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final RecipeService recipeService;

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        log.debug("getIndexPage before setting attribute to model");
        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug("getIndexPage after setting attribute to model");
        return "index";
    }
}
