package com.myrestaurant.store.PizzaRestaurantService.mapper;

import com.myrestaurant.store.PizzaRestaurantService.dto.PizzaDTO;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-20T17:58:44+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class PizzaMapperImpl implements PizzaMapper {

    @Override
    public Pizza asEntity(PizzaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Pizza.PizzaBuilder pizza = Pizza.builder();

        pizza.id( dto.getId() );
        pizza.name( dto.getName() );
        pizza.favorite( dto.isFavorite() );
        Set<Topping> set = dto.getToppings();
        if ( set != null ) {
            pizza.toppings( new LinkedHashSet<Topping>( set ) );
        }

        return pizza.build();
    }

    @Override
    public PizzaDTO asDTO(Pizza entity) {
        if ( entity == null ) {
            return null;
        }

        PizzaDTO.PizzaDTOBuilder pizzaDTO = PizzaDTO.builder();

        pizzaDTO.id( entity.getId() );
        pizzaDTO.name( entity.getName() );
        pizzaDTO.favorite( entity.isFavorite() );
        Set<Topping> set = entity.getToppings();
        if ( set != null ) {
            pizzaDTO.toppings( new LinkedHashSet<Topping>( set ) );
        }

        return pizzaDTO.build();
    }

    @Override
    public List<Pizza> asEntityList(List<PizzaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Pizza> list = new ArrayList<Pizza>( dtoList.size() );
        for ( PizzaDTO pizzaDTO : dtoList ) {
            list.add( asEntity( pizzaDTO ) );
        }

        return list;
    }

    @Override
    public List<PizzaDTO> asDTOList(List<PizzaDTO> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PizzaDTO> list = new ArrayList<PizzaDTO>( entityList.size() );
        for ( PizzaDTO pizzaDTO : entityList ) {
            list.add( pizzaDTO );
        }

        return list;
    }
}
