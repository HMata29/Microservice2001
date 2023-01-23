package com.myrestaurant.store.PizzaRestaurantService.service;

import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;

import java.util.List;

public interface PizzaService extends GenericsService <Pizza, Long>{
    List <Pizza> findByRestaurantId(Long restaurantId);
}
