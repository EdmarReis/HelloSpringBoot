package br.com.hellospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellospringboot.config.BeanTeste;
import br.com.hellospringboot.service.UserService;

@RestController
public class HomeController {
	
//	@Autowired
//	private UserService userService;
	
	@Autowired
	private BeanTeste teste1;
//	
//	@Autowired
//	private BeanTeste teste2;
	
	@RequestMapping("/")
	public String homeMessage() {
		
		System.out.println(teste1.getNome());
		teste1.setNome("Bean Teste 1");
		System.out.println(teste1.getNome());
		//System.out.println(teste2.getNome());
		//userService.buscarNomes();
		//userService.deletarDados();
		return "Meu primeiro spring boot - Hello Devs, Hello world!";
	}

}
