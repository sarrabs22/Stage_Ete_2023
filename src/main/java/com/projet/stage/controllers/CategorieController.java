package com.projet.stage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.stage.entities.Categorie;
import com.projet.stage.entities.Produit;
import com.projet.stage.repos.ProduitRepository;
import com.projet.stage.service.CategorieService;
import com.projet.stage.service.ProduitService;


@Controller
public class CategorieController {
	
	@Autowired
	ProduitRepository produitRepository;
	
	@Autowired
	ProduitService produitService;
	
	@Autowired
	CategorieService categorieService;
	@RequestMapping("/showAjout")
	public String showAjout(@ModelAttribute("categorie") Categorie categorie, Model model)
	{
		 List<Produit> produitsWithoutCategorie = produitService.getProduitsWithoutCategorie();
		    model.addAttribute("produits", produitsWithoutCategorie);

		
		
		return "createCategorie";
	}
	
	@RequestMapping("/saveCategorie")
	public String saveCategorie(@ModelAttribute("categorie") Categorie categorie, Model model, @RequestParam("nomCat") String nomCat,
	        @RequestParam("produits") List<Long> produitsIds) {

	    List<Produit> produitsWithoutCategorie = produitService.getProduitsWithoutCategorie();
	    model.addAttribute("produits", produitsWithoutCategorie);

	    List<Categorie> categories = categorieService.getCategorieByNom(nomCat);
	    if (!categories.isEmpty()) {
	        categorie = categories.get(0);
	    } else {
	        categorie = new Categorie();
	        categorie.setNomCat(nomCat);
	        categorieService.saveCategorie(categorie); // Sauvegarder la nouvelle catégorie
	    }

	    if (produitsIds != null) {
	        List<Produit> produits = produitService.getProduitsByIds(produitsIds);
	        for (Produit p : produits) {
	            p.setCategorie(categorie);
	            produitService.saveProduit(p);
	        }
	    }

	    return "createCategorie";
	}
	
	
	@RequestMapping("/listeCategories")
	public String listeCategories(ModelMap modelMap)
	{
	List<Categorie> prods = categorieService.getAllCategories();
	modelMap.addAttribute("categories", prods);
	return "listeCategories";
	}
	
	
	@RequestMapping("/supprimerCategorie")
	public String supprimerCategorie(@RequestParam("id") Long id)
	{
	produitService.deleteProduitById(id);
	
	
	return "listeCategories";
	}

}
