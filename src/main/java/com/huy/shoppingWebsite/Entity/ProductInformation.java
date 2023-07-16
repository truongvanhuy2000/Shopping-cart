package com.huy.shoppingWebsite.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
@Entity
@Getter
@Setter
@Table(name = "ProductInformation")
public class ProductInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private double price;
    @Column(name = "description")
    private String description;

    public ProductInformation(String image, double price, String description) {
        this.image = image;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
