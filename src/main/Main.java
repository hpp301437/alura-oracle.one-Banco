package main;

public class Main {
	public static void main(String[] args) {
	
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.deposita(500);

		
		
		System.out.println(primeiraConta.saldo);
	}

	
	


}
