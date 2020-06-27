package br.com.payment.services.exceptions;

public class AuthorizationException extends RuntimeException {

	private static final long serialVersionUID = 4242763762709040956L;
	
	public AuthorizationException(String msg) {
		super(msg);
	}
	
	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
	}
	

}
