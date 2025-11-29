package com.example.mealdb.controller;

import com.example.mealdb.service.MealdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/meals")
@CrossOrigin("*")   // for fontend loading
public class MealdbController {


    @Autowired
    private MealdbService mealService;


    @GetMapping("/search")
    public String searchMeals(@RequestParam String name) {
        return mealService.searchMeals(name);   // get meals by name (search)
    }


    @GetMapping("/categories")
    public String getCategories() {
        return mealService.getCategories();
    }   // get categories

                       // getmealbycategory method
    @GetMapping("/by-category")
    public String getMealsByCategory(@RequestParam String category) {
        return mealService.getMealsByCategory(category);
    }


    @GetMapping("/random")
    public String getRandomMeal() {
        return mealService.getRandomMeal();
    }  // random meal method where user get random meal

    // here  toatl receipe details
    @GetMapping("/details")
    public String getMealDetails(@RequestParam String id) {
        return mealService.getMealDetails(id);
    }












}
