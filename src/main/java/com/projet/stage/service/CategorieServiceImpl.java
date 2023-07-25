package com.projet.stage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.stage.entities.Categorie;
import com.projet.stage.repos.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService {

	
	@Autowired
	CategorieRepository categorieRepository;
	
	@Override
	public Categorie saveCategorie(Categorie p) {
		// TODO Auto-generated method stub
		return categorieRepository.save(p);
	}

	@Override
	public Categorie updateCategorie(Categorie p) {
		// TODO Auto-generated method stub
		return categorieRepository.save(p);
	}

	@Override
	public void deleteCategorie(Categorie p) {
		categorieRepository.delete(p);
		
	}

	@Override
	public void deleteCategorieById(Long id) {
		categorieRepository.deleteById(id);
		
	}

	@Override
	public Categorie getCategorie(Long id) {
		// TODO Auto-generated method stub
		return  categorieRepository.findById(id).get();
	}

	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	
	@Override
	public List<Categorie> getCategorieByNom(String nomCat) {
		return categorieRepository.findBynomCat(nomCat);
	}
	

}
