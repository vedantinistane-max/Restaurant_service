package FoodDelivery.Restaurant_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String cuisine;

    @Column
    private String phoneNumber;

    @Column
    private Double rating;

    @Column
    private String description;

// Default constructor

    public Restaurant() {}

    // Constructor with parameters
    public Restaurant(String name, String address, String cuisine, String phoneNumber, Double rating, String description) {
        this.name = name;
        this.address = address;
        this.cuisine = cuisine;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
        this.description = description;
    }

// Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) { this.cuisine = cuisine; }

    public String getPhonenNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating=" + rating +
                ", description='"+ description + '\'' +
                '}';
    }
}