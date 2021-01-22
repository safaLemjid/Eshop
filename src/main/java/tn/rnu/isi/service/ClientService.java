package tn.rnu.isi.service;

import java.util.List;

import tn.rnu.isi.model.Client;

public interface ClientService {
	
public Long save (Client client) throws Exception ;
	
	List<Client> getAll();
 
	Client getByIdClient(Long idClient) throws Exception;
	
	int updateId (Long idClient);
	
	int updateDesigClient(String loginClient,  String motPasseClient, String telClient, Long idClient);

	void deleteClient(Long idClient);

}
