package br.com.payment.services;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.payment.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			// método abaixo retorna usuário logado no sistema
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception error) {
			return null;
		}
	}

}
