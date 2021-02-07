package modelo;

public abstract class ContaAbstrataJ {
	
	private Integer numConta;
	private PessoaFisica cliente;
	private Double saldo;
	private Integer senha;
	
	//constructor from superclass
	public ContaAbstrataJ() {
	
		//
	}

	//constructor using Fields
	public ContaAbstrataJ(Integer numConta, PessoaFisica cliente, Double saldo, Integer senha) {
		
		this.numConta = numConta;
		this.cliente = cliente;
		this.saldo = saldo;
		this.senha = senha;
	}
	
	
	public double realizarSaque(double valor) {
		if(saldo >= valor)
			return saldo -= valor;
		else {
			System.out.println("Saldo insuficiente");
			return saldo;
		}
	}
	
	
	public double realizarDeposito(double valor) {
		return saldo += valor;
	}
	
	
	
	public boolean verificarSenha(Integer senha) {
		
	if(!this.senha.equals(senha)) {
		 System.out.println("Senha invalida");
		 return false;
		}else {
		 System.out.println("Bem-vindo(a) "+cliente.getNomePessoa());
		 return true;
		}
		
	}
	
	
	
	

	//generate getters and setters
	public Integer getNumConta() {
		return numConta;
	}


	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}


	public PessoaFisica getCliente() {
		return cliente;
	}


	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getSenha() {
		return senha;
	}


	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
