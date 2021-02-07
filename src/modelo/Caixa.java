package modelo;

public class Caixa extends Funcionario {

	private String senha = "123456";
	
	public Caixa() {
		
	}
	public double bonificacao() {
		
		return getSalario()*0.1;
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
