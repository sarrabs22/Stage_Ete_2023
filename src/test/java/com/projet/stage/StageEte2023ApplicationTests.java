package com.projet.stage;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.projet.stage.service.ProduitService;
import com.projet.stage.entities.Categorie;
import com.projet.stage.entities.Produit;
import com.projet.stage.repos.ProduitRepository;
@SpringBootTest
class StageEte2023ApplicationTests {
	@SuppressWarnings("unused")
	@Autowired
	private ProduitService produitService;
	@Autowired
	private ProduitRepository produitRepository;
	
	

	
	 @Test
	 public void testFindByNomProduit()
	 {
	 List<Produit> prods = produitRepository.findByNomProduit("test3");
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testFindByNomProduitContains ()
	 {
	 List<Produit> prods=produitRepository.findByNomProduitContains("te");
	 for (Produit p : prods)
	 {

System.out.println(p);
} }
	 
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Produit> prods = produitRepository.findByNomPrix("test3", 100.1);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByCategorie()
	 {
	 Categorie cat = new Categorie();
	 cat.setIdCat(1L);
	 List<Produit> prods = produitRepository.findByCategorie(cat);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 
	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<Produit> prods = produitRepository.findByCategorieIdCat(2L);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomProduitAsc()
	 {
	 List<Produit> prods =
	 produitRepository.findByOrderByNomProduitAsc();
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testTrierProduitsNomsPrix()
	 {
	 List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }


	 
	 }
	 


	 
