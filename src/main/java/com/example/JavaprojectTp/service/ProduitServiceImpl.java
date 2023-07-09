package com.example.JavaprojectTp.service;

import com.example.JavaprojectTp.modele.Produit;
import com.example.JavaprojectTp.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService{


    private final ProduitRepository produitRepository;


    @Override
    public Produit create(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> read() {
        return produitRepository.findAll();
    }

    @Override
    public Produit update(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p-> {
                   p.setName(produit.getName());
                   p.setPrice(produit.getPrice());
                   p.setCurrency(produit.getCurrency());
                   p.setTaxe(produit.getTaxe());
                   p.setExpired_at(produit.getExpired_at());
                   p.setProduced_by(produit.getProduced_by());
                    return  produitRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Produit non trouvé !"));
    }

    @Override
    public String delete(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprimé !";
    }

}
