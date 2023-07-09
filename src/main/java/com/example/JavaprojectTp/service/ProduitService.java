package com.example.JavaprojectTp.service;

import com.example.JavaprojectTp.modele.Produit;

import java.util.List;

public interface ProduitService {
    Produit create(Produit produit);
    List<Produit> read();
    Produit update(Long id, Produit produit);
    String delete(Long id);
}
