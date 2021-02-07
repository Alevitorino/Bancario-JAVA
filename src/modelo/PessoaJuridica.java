package modelo;

public class PessoaJuridica extends PessoaAbstrata {
	private String cnpj;
	ValidaCNPJ valid = new ValidaCNPJ();
	
	public void validacao() {
		if (valid.isCNPJ(cnpj)== false)
			System.out.println("CNPJ Invalido");
		else
			valid.imprimeCNPJ(cnpj);
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
