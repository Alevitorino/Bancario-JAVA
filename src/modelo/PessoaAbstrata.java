package modelo;

//serve para modelar as classes filhas
//somente em classes abstratatas podemos ter metodos abstratos 
//que significa OBRIGATORIOS

public abstract class PessoaAbstrata {
	
	private Integer idPessoa;
	private String nomePessoa;
	private String nomeSocial;
	private String cep;
	private String num;
	private String complemento;
	
	
	//metodos contrutores

	public PessoaAbstrata() {
	
	}
	
	
	
	public PessoaAbstrata(Integer idPessoa, String nomePessoa, String nomeSocial,String cep, String num,
			String complemento) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.nomeSocial = nomeSocial;
		this.cep = cep;
		this.num = num;
		this.complemento = complemento;
	
	}


	//metodos da classe
	




	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	
	//encapsulamentos
	
	
	
	
	

}
