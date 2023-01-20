package com.myrestaurant.store.PizzaRestaurantService.dto;

import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class PizzaDTO {
    private Long id;
    private String name;
    private boolean favorite;
    private Set<Topping> toppings = new HashSet<>();
}
