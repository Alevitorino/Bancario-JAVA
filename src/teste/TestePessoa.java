package teste;

import modelo.Conta;
import modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa cliente = new Pessoa();
		
		cliente.setNomePessoa("Fl�via Almeida");//armazenar
		System.out.println("Nome: " +cliente.getNomePessoa());//exibir
			
		
		Pessoa cliente2 = new Pessoa("Fl�via","05437084806");
	
	
		Conta conta = new Conta();
		conta.setCliente(cliente2);
		
		conta.setSenha(123456);
		conta.verificarSenha(123456);
			
	}
	
}
