package modelo;

public class Pessoa { 
	
	private Integer idPessoa;
	private String nomePessoa;
	private String nomeSocial;
	private String cpf;
	private String cep;
	private String num;
	private String complemento;
	
	
	//metodos contrutores
	
	public Pessoa() { //opcional 
		
	}
	
	public Pessoa(String nomePessoa, String cpf) { //obrigatorio
		this.nomePessoa = nomePessoa;
		this.cpf = cpf;
	}

	
	//metodos da classe
	
	//encapsulamentos
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	
	
	
	
	
	
	
	
	
	
	
	

}
