package com.example.JavaprojectTp.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private  double price;

    @Column(length = 3)
    private String currency;
    @Column
    private int taxe ;
    @Column
    private Date expired_at;
    @Column
    private String produced_by;
}
