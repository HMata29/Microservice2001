package com.myrestaurant.store.PizzaRestaurantService.mapper;

import com.myrestaurant.store.PizzaRestaurantService.dto.RestaurantDTO;
import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import com.myrestaurant.store.PizzaRestaurantService.model.Restaurant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-23T16:17:37+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public Restaurant asEntity(RestaurantDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Restaurant.RestaurantBuilder restaurant = Restaurant.builder();

        restaurant.id( dto.getId() );
        restaurant.name( dto.getName() );
        restaurant.address( dto.getAddress() );
        restaurant.city( dto.getCity() );
        Set<Driver> set = dto.getDrivers();
        if ( set != null ) {
            restaurant.drivers( new LinkedHashSet<Driver>( set ) );
        }

        return restaurant.build();
    }

    @Override
    public RestaurantDTO asDTO(Restaurant entity) {
        if ( entity == null ) {
            return null;
        }

        RestaurantDTO.RestaurantDTOBuilder restaurantDTO = RestaurantDTO.builder();

        restaurantDTO.id( entity.getId() );
        restaurantDTO.name( entity.getName() );
        restaurantDTO.address( entity.getAddress() );
        restaurantDTO.city( entity.getCity() );
        Set<Driver> set = entity.getDrivers();
        if ( set != null ) {
            restaurantDTO.drivers( new LinkedHashSet<Driver>( set ) );
        }

        return restaurantDTO.build();
    }

    @Override
    public List<Restaurant> asEntityList(List<RestaurantDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Restaurant> list = new ArrayList<Restaurant>( dtoList.size() );
        for ( RestaurantDTO restaurantDTO : dtoList ) {
            list.add( asEntity( restaurantDTO ) );
        }

        return list;
    }

    @Override
    public List<RestaurantDTO> asDTOList(List<Restaurant> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RestaurantDTO> list = new ArrayList<RestaurantDTO>( entityList.size() );
        for ( Restaurant restaurant : entityList ) {
            list.add( asDTO( restaurant ) );
        }

        return list;
    }
}
