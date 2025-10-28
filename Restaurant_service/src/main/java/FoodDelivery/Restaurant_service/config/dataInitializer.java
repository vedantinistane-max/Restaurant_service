package FoodDelivery.Restaurant_service.config;

//import FoodDelivery.*;
import FoodDelivery.Restaurant_service.model.Restaurant;
import FoodDelivery.Restaurant_service.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dataInitializer implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public dataInitializer(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void run (String... args) throws Exception{
        if (restaurantRepository.count() == 0) {
            Restaurant restaurant1 = new Restaurant(
                    "Luigi's Italian Kitchen",
                    "123 Main Street, New York, NY 10001",
                    "Italian",
                    "+1-555-0123",
                    4.5,
                    "Authentic Italian cuisine with homemade pasta and wood-fired pizzas"
            );

            Restaurant restaurant2 = new Restaurant(
                    "Dragon Palace",
                    "456 Oak Avenue, New York, NY 10002",
                    "Chinese",
                    "+1-555-0456",
                    4.2,
                    "Traditional Chinese dishes with modern presentation"
        );

            Restaurant restaurant3 = new Restaurant(
                    "The Burger Joint",
                    "789 Pine Road, New York, NY 10003",
                    "American",
                    "+1-555-0789",
                    4.8,
                    "Gourmet burgers and craft beer in a casual atmosphere"
        );
            Restaurant restaurant4 = new Restaurant(
                    "Sakura Sushi",
                    "321 Cherry Lane, New York, NY 10004",
                    "Japanese",
                    "+1-555-0321",
                    4.7,
                    "Fresh sushi and sashimi prepared by master chefs"
        );

            Restaurant restaurant5 = new Restaurant(
                    "Café Parisien",
                    "654 Elm Street, New York, NY 10005",
                    "French",
                    "+1-555-0654",
                    4.3,
                    "Classic French bistro with wine selection and romantic ambiance"

            );

// Save all restaurants to the database

        restaurantRepository.save(restaurant1);
        restaurantRepository.save(restaurant2);
        restaurantRepository.save(restaurant3);
        restaurantRepository.save(restaurant4);
        restaurantRepository.save(restaurant5);

        System.out.println("Sample restaurant data initialized successfully!");
     }

    }
}