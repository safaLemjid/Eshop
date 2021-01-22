package tn.rnu.isi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.rnu.isi.model.Client;

public interface ClientRepository extends CrudRepository <Client, Long> {
	
     Client findByIdClient(Long idClient);
	
	List<Client> findAll();
	
	Client save (Client client);
	
	@Modifying
	@Query("update Client u set u.idClient = ?1")
	int updateIdClient(Long idClient);
	
	@Modifying
	@Query("update Client u set u.loginClient = ?1, u.motPasseClient = ?2, u.telClient = ?3  where u.idClient = ?4")
	int updateDesigClient(String loginClient,  String motPasseClient, String telClient, Long idClient);

 	@Transactional
 	@Modifying
	@Query("delete from Client u where u.idClient = ?1")
	void delete(Long iidClient);


}
