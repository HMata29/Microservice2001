package com.myrestaurant.store.PizzaRestaurantService.controller;

import com.myrestaurant.store.PizzaRestaurantService.dto.PizzaDTO;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(tags = "pizza API")
public interface PizzaController {

    @ApiOperation("Finf pizza by restaurants id ")
    public List <PizzaDTO> findByRestaurantId(@PathVariable("id") Long restaurantId);
    @ApiOperation("Add new Pizza ")
    public PizzaDTO save(@RequestBody PizzaDTO pizzaDTO);

    @ApiOperation("Find Pizza By id")
    public PizzaDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete By id")
    public void delete (@PathVariable("id") Long id);

    @ApiOperation("Find all pizzas")
    public List<PizzaDTO> list();

    @ApiOperation("update Pizza")
    public PizzaDTO update(@RequestBody PizzaDTO pizzaDTO,@RequestParam("id") Long id);

}
