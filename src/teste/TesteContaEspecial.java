package teste;

import modelo.ContaEspecial;

public class TesteContaEspecial {
	public static void main(String[] args) {
		ContaEspecial ce =  new ContaEspecial();
		
		ce.realizarSaque(300.0);
		System.out.println("Saldo "+ ce.getSaldo());
		System.out.println(ce.getCliente());
		System.out.println(ce.getNumConta());
		/*ce.realizarDeposito(100);
		System.out.println("Seu saldo é de " +ce.getSaldo());
		 */
		}
}
 