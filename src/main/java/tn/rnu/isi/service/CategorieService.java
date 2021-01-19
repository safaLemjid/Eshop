package tn.rnu.isi.service;

import java.util.List;

import tn.rnu.isi.model.Categorie;

public interface CategorieService {
	
public Long save (Categorie categorie) throws Exception ;
	
	List<Categorie> getAll();
 
	Categorie getByIdCategorie(Long idCateg) throws Exception;
	
	int updateId (Long idCateg);
	
  	int updateDesig (String libelleCateg, String  codeCateg, Long idCateg); 
  	
  	void deleteCategorie(Long idCateg);
  	

}
