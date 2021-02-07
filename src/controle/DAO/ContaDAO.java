package controle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controle.FabricaDeConexoes;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.PessoaFisica;

public class ContaDAO {

	private Connection conn;

	public ContaDAO() {

		conn = new FabricaDeConexoes().getConnection();

	}

	public void inserircontaF(ContaCorrente conta) throws SQLException {

		String sql = "insert into contacorrente (numConta,idCliente,saldo,senha) values (?,?,?,?)";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, conta.getNumConta());
		stmt.setInt(2, conta.getCliente());
		stmt.setDouble(3, conta.getSaldo());
		stmt.setInt(4, conta.getSenha());


		stmt.execute();
		stmt.close();
		conn.close();

	}

	public void inserircontaJ(ContaEspecial conta) throws SQLException {

		String sql = "insert into contaespecial (numConta,idCliente,saldo,senha, limite) values (?,?,?,?,?)";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, conta.getNumConta());
		stmt.setInt(2, conta.getCliente());
		stmt.setDouble(3, conta.getSaldo());
		stmt.setInt(4, conta.getSenha());
		stmt.setDouble(5, conta.getLimite());

		stmt.execute();
		stmt.close();
		conn.close();

	}

	public void excluircontaF(Integer numConta) throws SQLException {

		String sql = "delete from contacorrente where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, numConta);

		
		stmt.execute();
		stmt.close();
		conn.close();

	}

	public void excluircontaJ(Integer numConta) throws SQLException {

		String sql = "delete from contaespecial where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, numConta);

		stmt.execute();
		stmt.close();
		conn.close();

	}

	public void alterarcontaF(ContaCorrente conta, Integer numConta) throws SQLException {

		String sql = "update contacorrente set saldo=?, senha=? where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setDouble(1, conta.getSaldo());
		stmt.setInt(2, conta.getSenha());
		stmt.setInt(3, conta.getNumConta());


		stmt.execute();
		stmt.close();
		conn.close();

	}

	public void alterarcontaJ(ContaEspecial conta, Integer idPessoa) throws SQLException {

		String sql =  "update contaespecial set saldo=?, senha=?, limite = ? where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setDouble(1, conta.getSaldo());
		stmt.setInt(2, conta.getSenha());
		stmt.setDouble(3, conta.getLimite());
		stmt.setInt(4, conta.getNumConta());


		stmt.execute();
		stmt.close();
		conn.close();

	}

	public List<ContaCorrente> consultarcontaFNum(int numConta) throws SQLException {

		String sql = "select * from contacorrente where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, numConta);

		ResultSet rs = stmt.executeQuery();

		List<ContaCorrente> contacomum = new ArrayList<ContaCorrente>();

		while (rs.next()) {
			ContaCorrente cc = new ContaCorrente();
			PessoaFisica pf = new PessoaFisica();
			
			cc.setNumConta(rs.getInt("numConta"));
			cc.setSaldo(rs.getDouble("saldo"));
			
			pf.setIdPessoa(rs.getInt("idPessoa"));
			
			cc.setCliente(pf);

			contacomum.add(cc);

		}
		rs.close();
		stmt.close();
		conn.close();
		return contacomum;

	}

	public List<ContaEspecial> consultarcontaJNum(int numConta) throws SQLException {

		String sql = "select * from contaespecial where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setInt(1, numConta);

		ResultSet rs = stmt.executeQuery();

		List<ContaEspecial> contaespecial = new ArrayList<ContaEspecial>();

		while (rs.next()) {
			ContaEspecial cc = new ContaEspecial();
			PessoaFisica pf = new PessoaFisica();
			
			cc.setNumConta(rs.getInt("numConta"));
			cc.setSaldo(rs.getDouble("saldo"));
			cc.setLimite(rs.getDouble("limite"));
			
			pf.setIdPessoa(rs.getInt("idPessoa"));
			
			cc.setCliente(pf);
			contaespecial.add(cc);

		}
		rs.close();
		stmt.close();
		conn.close();
		return contaespecial;

	}


 public boolean logarContaCorrente(int numConta,int senha) throws SQLException  {
                boolean status;
		String sql = "select * from contacorrente where"
                        + " numConta = ? and senha = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, numConta);
                stmt.setInt(2, senha);

		ResultSet rs = stmt.executeQuery();

		if(rs.next()) {
                     status = true;
		}else{
                    status = false;
                }
		rs.close();
		stmt.close();
		conn.close();
		
                return status;    
	}

 public boolean logarContaEspecial(int numConta,int senha) throws SQLException  {
                boolean status;
		String sql = "select * from contacorrente where"
                        + " numConta = ? and senha = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, numConta);
                stmt.setInt(2, senha);

		ResultSet rs = stmt.executeQuery();

		if(rs.next()) {
                     status = true;
		}else{
                    status = false;
                }
		rs.close();
		stmt.close();
		conn.close();
		
                return status;    
	}
  public void depositarContaCorrente(int numConta, double valor) throws SQLException  {
                
                double saldo = 0;
		String sql = "select * from contacorrente where numConta = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, numConta);
                stmt.setDouble(2, valor);

		ResultSet rs = stmt.executeQuery();

		if(rs.next()) {
                     saldo = rs.getDouble("saldo");
                     saldo += valor;
                     String sql2 = "update contacorrente set saldo=?, senha=? where numConta = ?";
                     stmt.setDouble(1, valor);
                     stmt.execute();
                     
                     
		}
                rs.close();
		stmt.close();
		conn.close();
		
                  
	}



}
