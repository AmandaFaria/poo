package Exercicios;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String dtEmbarque,p,o,d;
		
		Aviao aviao = new Aviao("Guilherme Bernardes","LATAM","13:00","15:30"," "," "," "," ");
		
		try
		{
			System.out.println("\nInforme o nome do passageiro: ");
			p = leia.nextLine();
			aviao.setPassageiro(p);
			
			System.out.println("\nInforme seu local de origem: ");
			o = leia.nextLine();
			aviao.setOrigem(o);
			
			System.out.println("\nInforme seu local de destino: ");
			d = leia.nextLine();
			aviao.setDestino(d);
			
			System.out.println("\nInforme a data que deseja embarcar: ");
			dtEmbarque = leia.nextLine();
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = df.parse(dtEmbarque);
			aviao.setData(dtEmbarque);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("\n******************** CARTÃO DE EMBARQUE ********************");
		aviao.infoAviao();
		System.out.println("\n*************************************************************");		
		
		
	}

}
