package modelo;

public class PessoaFisica extends PessoaAbstrata {
	private String cpf;
	
	public PessoaFisica() {
		
	}
	
	
ValidaCPF valid = new ValidaCPF();
	
	public boolean validacao() {
		if (!valid.validarC(cpf)) {
			System.out.println("CPF Inv�lido");
		return false;
	}else
		return true;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


    }
	

