package br.com.hellospringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
//import br.com.hellospringboot.repository.UserRepository;

@Configuration
public class BeanConfig {
	
	
//	@Bean
//	public UserRepository userRepository() {
//		return new UserRepository();
//	}
	
	@Bean
	@SessionScope
	public BeanTeste beanTeste() {
		
		return new BeanTeste();
	}
	
}
