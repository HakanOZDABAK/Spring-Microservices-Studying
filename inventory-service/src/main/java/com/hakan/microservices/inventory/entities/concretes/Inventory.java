package com.hakan.microservices.inventory.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_inventory")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String skuCode;
    public  Integer quantity;
}
