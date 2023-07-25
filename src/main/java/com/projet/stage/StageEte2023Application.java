package com.projet.stage;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.stage.entities.Produit;
import com.projet.stage.service.ProduitService;

@SpringBootApplication
public class StageEte2023Application {
	@Autowired
	ProduitService produitService;

	public static void main(String[] args) {
		SpringApplication.run(StageEte2023Application.class, args);
	}
	
	
	public void run(String... args) throws Exception {
	
	}


}
