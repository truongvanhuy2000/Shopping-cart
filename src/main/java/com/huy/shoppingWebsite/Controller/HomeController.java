package com.huy.shoppingWebsite.Controller;

import com.huy.shoppingWebsite.Entity.Category;
import com.huy.shoppingWebsite.Service.Category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private final CategoryService categoryService;
    @Autowired
    public HomeController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("categories", categoryService.findAllCategory());
        return "home";
    }


}
