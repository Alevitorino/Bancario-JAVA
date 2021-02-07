package modelo;

public class Gerente extends Funcionario {
	private String senha = "123456";
	public Gerente() {
		
	}
	
	public double bonificacao() {
		
		return (getSalario()*0.175)+ 2500.0;
	}
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
