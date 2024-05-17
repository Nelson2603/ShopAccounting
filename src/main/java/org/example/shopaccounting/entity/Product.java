package org.example.shopaccounting.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private long article;

    @Column(name = "name_product" , nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private final LocalDate dateManufacture;

    @Column(nullable = false)
    private final LocalDate bestBefore;

    public Product() {
        this.dateManufacture = null;
        this.bestBefore = null;
    }


}
