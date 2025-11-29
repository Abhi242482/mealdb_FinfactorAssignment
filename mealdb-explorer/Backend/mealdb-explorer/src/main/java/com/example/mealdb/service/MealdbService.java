package com.example.mealdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MealdbService {


    private static final String BASE_URL = "https://www.themealdb.com/api/json/v1/1/";

    @Autowired
    private RestTemplate restTemplate;

    //  here I search meal by using MealName
    @Cacheable(value = "mealsCache", key = "#name")
    public String searchMeals(String name) {
        String url = UriComponentsBuilder
                .fromHttpUrl(BASE_URL + "search.php")
                .queryParam("s", name)
                .toUriString();
        return restTemplate.getForObject(url, String.class);
    }

    //  here I want get list of categories
    @Cacheable(value = "mealsCache", key = "'categories'")
    public String getCategories() {
        return restTemplate.getForObject(BASE_URL + "categories.php", String.class);
    }

    // get meal under category
    @Cacheable(value = "mealsCache", key = "#category")
    public String getMealsByCategory(String category) {
        String url = UriComponentsBuilder
                .fromHttpUrl(BASE_URL + "filter.php")
                .queryParam("c", category)
                .toUriString();
        return restTemplate.getForObject(url, String.class);
    }

    // is there random meal service method
    @Cacheable(value = "mealsCache", key = "'random'")
    public String getRandomMeal() {
        return restTemplate.getForObject(BASE_URL + "random.php", String.class);
    }

    // get recipe by using id
    @Cacheable(value = "mealsCache", key = "#id")
    public String getMealDetails(String id) {
        String url = UriComponentsBuilder
                .fromHttpUrl(BASE_URL + "lookup.php")
                .queryParam("i", id)
                .toUriString();
        return restTemplate.getForObject(url, String.class);
    }



}
