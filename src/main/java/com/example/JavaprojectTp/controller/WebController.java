package com.example.JavaprojectTp.controller;

import com.example.JavaprojectTp.modele.Produit;
import com.example.JavaprojectTp.service.ProduitService;
import org.springframework.stereotype.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/web")
@RequiredArgsConstructor
public class WebController {
    private final ProduitService produitService;
    @GetMapping("/read")
    public String readPro (Model model) {
        List<Produit> produits = produitService.read();
        model.addAttribute("products", produits);
        return  "pp";
    }

}
