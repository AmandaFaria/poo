package Exercicios;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	
	public Cliente(String nome, String sobren, String cpf, String tel)
	{
		this.nome = nome;
		this.sobrenome = sobren;
		this.cpf = cpf;
		this.telefone = tel;
	}
	
	public void imprimirCliente()
	{
		System.out.println("\nCliente: "+nome+" "+sobrenome+" cpf: "+cpf+" tel: "+telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
