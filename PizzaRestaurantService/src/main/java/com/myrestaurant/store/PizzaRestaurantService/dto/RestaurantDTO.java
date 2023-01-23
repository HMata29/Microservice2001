package com.myrestaurant.store.PizzaRestaurantService.dto;

import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class RestaurantDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private Set<Driver> drivers = new HashSet<>();
    private Set<Pizza> pizzaS = new HashSet<>();

}
