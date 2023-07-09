package com.example.JavaprojectTp.controller;

import com.example.JavaprojectTp.modele.Produit;
import com.example.JavaprojectTp.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @PostMapping("/create")
    public  Produit createProd(@RequestBody Produit produit){
        return  produitService.create(produit);
    }

    @GetMapping("/read")
    public List<Produit> readPro(){
        return  produitService.read();
    }

    @PutMapping("/update/{id}")
    public Produit updatePro(@PathVariable Long id,@RequestBody Produit produit){
        return  produitService.update(id,produit);
    }
    @DeleteMapping("/delete/{id}")
    public  String deletePro(@PathVariable Long id){
        return  produitService.delete(id);
    }
}
