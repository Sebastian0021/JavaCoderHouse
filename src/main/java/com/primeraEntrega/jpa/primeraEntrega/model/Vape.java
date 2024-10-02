package com.primeraEntrega.jpa.primeraEntrega.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "vape")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Vape {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "price")
    private Double price;
    
    @Column(name = "stock")
    private int stock;
    
    @Column(name = "brand")
    private String brand;
    
    @Column(name = "flavor")
    private String flavor;
    
    @Column(name = "puffs")
    private int puffs;
}
