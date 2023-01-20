package com.myrestaurant.store.PizzaRestaurantService.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ToppingDTO {
    private Long id;
    private String name;
}
