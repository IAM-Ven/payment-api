package br.com.payment.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.payment.domain.Cliente;
import br.com.payment.domain.Pedido;

public interface EmailService {
	
	public void sendOrderConfirmationEmail(Pedido pedido);
	
	public void sendEmail(SimpleMailMessage msg);
	
	public void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	public void sendHtmlEmail(MimeMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
