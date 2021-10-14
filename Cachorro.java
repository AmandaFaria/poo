package Exercicios;

public class Cachorro extends Animal {

	private String porte;
	private String raca;
	
	public Cachorro(String nome,int idade,String porte,String raca)
	{
		super(nome,idade);
		this.porte = porte;
		this.raca = raca;
	}
	
	@Override //m�todo polimorfico
	public void emitirSom(String som)
	{
		System.out.println("\nO cachorro est� latindo "+som);
	}
	
	@Override
	public void acao(String movimento)
	{
		System.out.println("\nO cachorro est� "+movimento);
	}
	
	
	public void imiprime()
	{
		System.out.println("\nNome do cachorro: "+getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("\nPorte do cachorro: "+porte);
		System.out.println("\nRa�a do cachorro: "+raca);
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}			
	
}
