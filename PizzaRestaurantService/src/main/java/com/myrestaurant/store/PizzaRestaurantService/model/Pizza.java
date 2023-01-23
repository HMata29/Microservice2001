package com.myrestaurant.store.PizzaRestaurantService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Builder
@Table(name = "pizzas")
public class Pizza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private Long id;

    @NotBlank
    @Length(max = 255)
    @Column(name = "name")
    private String name;

    @Column (name = "favorite")
    private boolean favorite;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE} )
    @JoinTable(
            name = "pizzas_toppings",
            joinColumns = @JoinColumn(
                    name = "pizza_id", referencedColumnName = "pizza_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "topping_id" , referencedColumnName = "topping_id"
            )
    )

    @JsonIgnore
    private Set<Topping> toppings = new HashSet<>();

    @ManyToMany (mappedBy = "pizzas")//corrisponde a pizzas in restautrants
    @JsonIgnore
    private Set<Restaurant> restaurants = new HashSet<>();

}
