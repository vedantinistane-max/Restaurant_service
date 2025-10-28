package FoodDelivery.Restaurant_service.service;

import FoodDelivery.Restaurant_service.model.Restaurant;
import FoodDelivery.Restaurant_service.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
         this.restaurantRepository = restaurantRepository;
    }
/**
 * Retrieve all restaurants from the database
* @return List of all restaurants
*/
    public List<Restaurant> getAllRestaurants() {return restaurantRepository.findAll();}
/**I
 * Save a new restaurant to the database
 @param restaurant Restaurant to save
  * @return Saved restaurant
 */
 public Restaurant saveRestaurant (Restaurant restaurant){ return restaurantRepository.save(restaurant);}
    }