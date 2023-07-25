package com.projet.stage.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.stage.entities.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie, Long> {
	
	List<Categorie> findAll();
	 List<Categorie> findBynomCat(String nomCat);
	

}
