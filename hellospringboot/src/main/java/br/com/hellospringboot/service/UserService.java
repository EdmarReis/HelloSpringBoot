package br.com.hellospringboot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellospringboot.entity.User;
//import br.com.hellospringboot.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	//private UserRepository userRepository;
	
	public List<String> buscarNomes(){
		List<String> nomes = new ArrayList<>();
		System.out.println("Chamou o método de buscar nomes");
		
		return nomes;
	}
	
	public void deletarDados() {
		System.out.println("Chamou o delete do UserRepository");
		//userRepository.deleteById(1L);
	}
	
	public void inserirDados(User user) {
		//userRepository.save(user);
	}

}
