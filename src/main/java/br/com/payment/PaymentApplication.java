package br.com.payment;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.payment.domain.Categoria;
import br.com.payment.domain.Cidade;
import br.com.payment.domain.Cliente;
import br.com.payment.domain.Endereco;
import br.com.payment.domain.Estado;
import br.com.payment.domain.ItemPedido;
import br.com.payment.domain.Pagamento;
import br.com.payment.domain.PagamentoComBoleto;
import br.com.payment.domain.PagamentoComCartao;
import br.com.payment.domain.Pedido;
import br.com.payment.domain.Produto;
import br.com.payment.domain.enums.EstadoPagamento;
import br.com.payment.domain.enums.TipoCliente;
import br.com.payment.repositories.CategoriaRepository;
import br.com.payment.repositories.CidadeRepository;
import br.com.payment.repositories.ClienteRepository;
import br.com.payment.repositories.EnderecoRepository;
import br.com.payment.repositories.EstadoRepository;
import br.com.payment.repositories.ItemPedidoRepository;
import br.com.payment.repositories.PagamentoRepository;
import br.com.payment.repositories.PedidoRepository;
import br.com.payment.repositories.ProdutoRepository;

@SpringBootApplication
public class PaymentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
