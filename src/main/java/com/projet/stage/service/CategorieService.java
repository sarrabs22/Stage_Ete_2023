package com.projet.stage.service;

import java.util.List;

import com.projet.stage.entities.Categorie;



public interface CategorieService {
	
	
	Categorie saveCategorie(Categorie p);
	Categorie updateCategorie(Categorie p);
	void deleteCategorie(Categorie p);
	void deleteCategorieById(Long id);
	Categorie getCategorie(Long id);
	List<Categorie> getAllCategories();
	List<Categorie> getCategorieByNom(String nomCat);

}
