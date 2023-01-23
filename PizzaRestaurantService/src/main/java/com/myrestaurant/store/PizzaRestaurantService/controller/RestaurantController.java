package com.myrestaurant.store.PizzaRestaurantService.controller;

import com.myrestaurant.store.PizzaRestaurantService.dto.PizzaDTO;
import com.myrestaurant.store.PizzaRestaurantService.dto.RestaurantDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(tags = "restaurant API")
public interface RestaurantController {
    @ApiOperation("Add new Restaurant ")
    public RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO);

    @ApiOperation("Find Restaurant By id")
    public RestaurantDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete By id")
    public void delete (@PathVariable("id") Long id);

    @ApiOperation("Find all restaurants")
    public List<RestaurantDTO> list();

    @ApiOperation("update Restaurants")
    public RestaurantDTO update(@RequestBody RestaurantDTO restaurantDTO,@RequestParam("id") Long id);
}
