package controle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controle.FabricaDeConexoes;
import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class ClienteDAO {

	private Connection conn;

	public ClienteDAO() {

		conn = new FabricaDeConexoes().getConnection();

	}

	public void inserirClienteF(PessoaFisica cliente) throws SQLException {
		
		 String sql = "insert into clientesf (nomePessoa,nomeSocial,cpf,"
				+ "cep,num,compl) values (?,?,?,?,?,?);";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, cliente.getNomePessoa());
		stmt.setString(2, cliente.getNomeSocial());
		stmt.setString(3, cliente.getCpf());
		stmt.setString(4, cliente.getCep());
		stmt.setString(5, cliente.getNum());
		stmt.setString(6, cliente.getComplemento());
		
		stmt.execute();
		stmt.close();
		conn.close();
			
	}
	
	public void inserirClienteJ(PessoaJuridica cliente) throws SQLException {
		
		 String sql = "insert into clientesj (nomePessoa,nomeSocial,cnpj,"
				+ "cep,num,compl) values (?,?,?,?,?,?);";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, cliente.getNomePessoa());
		stmt.setString(2, cliente.getNomeSocial());
		stmt.setString(3, cliente.getCnpj());
		stmt.setString(4, cliente.getCep());
		stmt.setString(5, cliente.getNum());
		stmt.setString(6, cliente.getComplemento());
		
		stmt.execute();
		stmt.close();
		conn.close();
			
	}

	public void excluirClienteF (String cpf) throws SQLException {
		String sql = "delete from clientesf where cpf = ?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, cpf);
		
		stmt.execute();
		stmt.close();
		conn.close();
	}
	public void excluirClienteJ (String cnpj) throws SQLException {
		String sql = "delete from clientesj where cnpj = ?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, cnpj);
			
		stmt.execute();
		stmt.close();
		conn.close();
	}
	public void alterarClienteF(PessoaFisica cliente, Integer idPessoa) throws SQLException {
		String sql = "uptade clientesf set nomePessoa= ?,nomeSocial=?,cpf=?,cep=?,num=?,complemento=? where idPessoa = ?;";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, cliente.getNomePessoa());
		stmt.setString(2, cliente.getNomeSocial());
		stmt.setString(3, cliente.getCpf());
		stmt.setString(4, cliente.getCep());
		stmt.setString(5, cliente.getNum());
		stmt.setString(6, cliente.getComplemento());
		stmt.setInt(7, idPessoa);
		
		
		stmt.execute();
		stmt.close();
		conn.close();
		
	}
	public List<PessoaFisica> consultarClienteFNome(String nome) throws SQLException{
		String sql = "select * from clientesf where nomePessoa like ?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, "%"+nome+"%");
		stmt.setString(1, nome);
		ResultSet rs = stmt.executeQuery();
		List<PessoaFisica> clientesF = new ArrayList<PessoaFisica>();
		while (rs.next()) {
			PessoaFisica pf = new PessoaFisica();
			pf.setNomePessoa(rs.getString("nomePessoa"));
			pf.setNomeSocial(rs.getString("nomeSocial"));
			pf.setCpf(rs.getString("cpf"));
			pf.setCep(rs.getString("cep"));
			pf.setNum(rs.getString("num"));
			pf.setComplemento(rs.getString("complemento"));
			clientesF.add(pf);
		}
		rs.close();
		stmt.close();
		conn.close();
		return clientesF;
		
	}
	public void alterarClienteJ(PessoaJuridica cliente, Integer idPessoa) throws SQLException {
		String sql = "uptade clientesj set nomePessoa= ?,nomeSocial=?,cnpj=?,cep=?,num=?,complemento=? where idPessoa = ?;";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, cliente.getNomePessoa());
		stmt.setString(2, cliente.getNomeSocial());
		stmt.setString(3, cliente.getCnpj());
		stmt.setString(4, cliente.getCep());
		stmt.setString(5, cliente.getNum());
		stmt.setString(6, cliente.getComplemento());
		stmt.setInt(7, idPessoa);
		
		
		stmt.execute();
		stmt.close();
		conn.close();
		
	}
	public List<PessoaJuridica> consultarClienteJNome(String nome) throws SQLException{
		String sql = "select * from clientesj where nomePessoa = ?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, nome);
		ResultSet rs = stmt.executeQuery();
		List<PessoaJuridica> clientesJ = new ArrayList<PessoaJuridica>();
		while (rs.next()) {
			PessoaJuridica pj = new PessoaJuridica();
			pj.setNomePessoa(rs.getString("nomePessoa"));
			pj.setNomeSocial(rs.getString("nomeSocial"));
			pj.setCnpj(rs.getString("cnpj"));
			pj.setCep(rs.getString("cep"));
			pj.setNum(rs.getString("num"));
			pj.setComplemento(rs.getString("complemento"));
			clientesJ.add(pj);
		}
		rs.close();
		stmt.close();
		conn.close();
		return clientesJ;
		
	}
        public int buscarClienteCpf(String cpf) throws SQLException  {
                int id = 0;
		String sql = "select * from clientesf where"
                        + " cpf = ?;";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, cpf);
                

		ResultSet rs = stmt.executeQuery();

		if(rs.next()) {
                     id = rs.getInt("idPessoa");
		}
		rs.close();
		stmt.close();
		conn.close();
		
                return id;    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
