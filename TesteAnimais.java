package Exercicios;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog = new Cachorro("Indefinido",3,"Indefinido","Indefinida");
		Cavalo horse = new Cavalo("Indefinido",5,"Infinida",500,"Indefinido");
		Preguica sloth = new Preguica("Indefinido",7,"Longo","folhas","lento");
		
		Scanner leia = new Scanner(System.in);
		String nCachorro,nCavalo,nPreguica,porteCach,rCach,corCav,utilCav;
				
		
	 		System.out.println("\nInforme um nome para o cachorro: ");
			nCachorro = leia.nextLine();
			dog.setNome(nCachorro);
			
			System.out.println("\nQual o porte do seu cachorro: ");
			porteCach = leia.nextLine();
			dog.setPorte(porteCach);
			
			System.out.println("\nQual a raça dele: ");
			rCach = leia.nextLine();
			dog.setRaca(rCach);
			
			System.out.println("\n--------------- INFORMAÇÕES DO CACHORRO ---------------");
			dog.imiprime();
			System.out.println("\n-------------------------------------------------------");
			
			System.out.println("\nInforme um nome para o cavalo: ");
			nCavalo = leia.nextLine();
			horse.setNome(nCavalo);
			
			System.out.println("\nQual a cor da pelagem dele(a): ");
			corCav = leia.nextLine();
			horse.setCor(corCav);
			
			System.out.println("\nQual a utilidade do seu cavalo: ");
			utilCav = leia.nextLine();
			horse.setUtilidade(utilCav);
			
			System.out.println("\n--------------- INFORMAÇÕES DO CAVALO ---------------");
			horse.imiprime();
			System.out.println("\n-----------------------------------------------------");
			
			System.out.println("\nInforme um nome para o bicho-preguiça: ");
			nPreguica = leia.nextLine();
			sloth.setNome(nPreguica);
			
			System.out.println("\n--------------- INFORMAÇÕES DO BICHO-PREGUIÇA ---------------");
			sloth.imiprime();
			System.out.println("\n-------------------------------------------------------------");
			
			System.out.println("\n--------------- INFORMAÇÕES DOS ANIMAIS ---------------");
			dog.imiprime();
			horse.imiprime();
			sloth.imiprime();
			System.out.println("\n-------------------------------------------------------");

	}

}
