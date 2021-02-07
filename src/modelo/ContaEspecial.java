package modelo;



public class ContaEspecial extends ContaAbstrataF{

		private double limite = 100.00;

		public double realizarSaque(double valor) {
			if(getSaldo() <= valor) {
				setSaldo(getSaldo()-valor);
			}if (getSaldo() < valor && getSaldo()+limite>=valor) {
				setSaldo(-(getSaldo()));
			}
			else {
				System.out.println("Saldo indisponível");
			}
			return valor;
			
				  }
		public double realizarDeposito(double valor) {
			if(getSaldo() >= valor) {
				setSaldo(getSaldo()+valor);
			}if (getSaldo() < valor && getSaldo()+limite>=valor) {
				setSaldo(+(getSaldo()));
			}
			else {
				System.out.println("Teste");
			}
			return valor;
			
				  }
		
		
		public void setLimite(double double1) {
		
			
		}
		public double getLimite() {
			
			return 0;
		}
		
		
		}

