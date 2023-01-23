package com.myrestaurant.store.PizzaRestaurantService.mapper;

import com.myrestaurant.store.PizzaRestaurantService.dto.DriverDTO;
import com.myrestaurant.store.PizzaRestaurantService.model.Driver;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-23T14:09:19+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class DriverMapperImpl implements DriverMapper {

    @Override
    public Driver asEntity(DriverDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Driver.DriverBuilder driver = Driver.builder();

        return driver.build();
    }

    @Override
    public DriverDTO asDTO(Driver entity) {
        if ( entity == null ) {
            return null;
        }

        DriverDTO driverDTO = new DriverDTO();

        return driverDTO;
    }

    @Override
    public List<Driver> asEntityList(List<DriverDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Driver> list = new ArrayList<Driver>( dtoList.size() );
        for ( DriverDTO driverDTO : dtoList ) {
            list.add( asEntity( driverDTO ) );
        }

        return list;
    }

    @Override
    public List<DriverDTO> asDTOList(List<Driver> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DriverDTO> list = new ArrayList<DriverDTO>( entityList.size() );
        for ( Driver driver : entityList ) {
            list.add( asDTO( driver ) );
        }

        return list;
    }
}