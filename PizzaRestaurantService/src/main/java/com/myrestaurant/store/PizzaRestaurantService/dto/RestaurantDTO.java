package com.myrestaurant.store.PizzaRestaurantService.dto;

import com.myrestaurant.store.PizzaRestaurantService.model.Driver;

import java.util.HashSet;
import java.util.Set;

public class RestaurantDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private Set<DriverDTO> drivers = new HashSet<>();

}
