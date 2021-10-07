package Exercicios;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente[] cli = new Cliente[2];
		
		cli[0] = new Cliente("Amanda","Faria","123.456.789-12","(13)12345-6789");
		cli[1] = new Cliente("Guilherme","Ribeiro","952.202.052-42","(34) 98623-8881");
		
		for(Cliente roda:cli)
		{
			roda.imprimirCliente();
		}		
		
		
	}

}
