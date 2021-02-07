package teste;

import java.sql.SQLException;

import controle.DAO.ClienteDAO;
import controle.FabricaDeConexoes;
import modelo.PessoaFisica;
import modelo.ValidaCPF;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		FabricaDeConexoes conn = new FabricaDeConexoes();
		
		conn.getConnection();
		
		ClienteDAO cdao = new ClienteDAO();
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNomePessoa("Alexandre Vitorino do Vale Lins");
		pf.setNomeSocial("Ale");
		pf.setCep("25040080");
		pf.setNum("3");
		pf.setComplemento("Casa");
		pf.setCpf("17524045727");
		
		ValidaCPF valid = new ValidaCPF();
		
		if (valid.validarC(pf.getCpf()) == true) {
			cdao.inserirClienteF(pf);
		}else
			System.out.println("CPF Invalido");
		
	}
}
