package modelo;

public class Atendente extends Funcionario {
	private String senha = "123456789";
	
	public Atendente() {
		
	}

	
	public double bonificacao() {

		return getSalario()*0.05;
	}


	@Override
	public boolean validaSenha() {
		if(getSenha().equals(senha)) {
			 System.out.println("Bem vindo(a) "+getNome()+"!");
			 return true;
			}else {
			 System.out.println("Senha invalida");
			 return false;
			}
	}
}
