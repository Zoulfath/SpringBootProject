package com.example.JavaprojectTp.repository;

import com.example.JavaprojectTp.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository <Produit,Long> {
}
