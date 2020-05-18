package br.com.payment.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 4242763762709040956L;
	
	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}
	

}
