package br.com.payment.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmailDTO implements Serializable {

	private static final long serialVersionUID = -8137424897598760845L;
	
	@NotEmpty(message = "Preenchimento obrigatório.")
	@Email(message = "Email inválido.")
	private String email;

	public EmailDTO() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
