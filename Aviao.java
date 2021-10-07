package Exercicios;

public class Aviao {
	private String passageiro;
	private String origem;
	private String destino;
	private String data;
	private String horaPartida;
	private String horaChegada;	
	private String nomePiloto;
	private String linhaAerea;

	
public Aviao(String nPiloto,String lAerea,String hrPart, String hrCheg,String origem,String dest,String data,String pass)
{
	this.passageiro=pass;
	this.origem = origem;
	this.destino = dest;
	this.data = data;
	this.horaPartida = hrPart;
	this.horaChegada = hrCheg;
	this.nomePiloto = nPiloto;
	this.linhaAerea = lAerea;
	
}

public void infoAviao()
{
	System.out.println("\nPassageiro: "+passageiro);
	System.out.println("\nLocal de Origem: "+origem);
	System.out.println("\nLocal do Destino: "+destino);
	System.out.println("\nData de Embarque: "+data);
	System.out.println("\nHorário da Partida: "+horaPartida);
	System.out.println("\nHoráio da Chegada: "+horaChegada);	
	System.out.println("\nPiloto: "+nomePiloto);
	System.out.println("\nLinha Aérea: "+linhaAerea);
	
}

public String getNomePiloto() {
	return nomePiloto;
}

public void setNomePiloto(String nomePiloto) {
	this.nomePiloto = nomePiloto;
}

public String getLinhaAerea() {
	return linhaAerea;
}

public void setLinhaAerea(String linhaAerea) {
	this.linhaAerea = linhaAerea;
}

public String getHoraPartida() {
	return horaPartida;
}

public void setHoraPartida(String horaPartida) {
	this.horaPartida = horaPartida;
}

public String getHoraChegada() {
	return horaChegada;
}

public void setHoraChegada(String horaChegada) {
	this.horaChegada = horaChegada;
}

public String getOrigem() {
	return origem;
}

public void setOrigem(String origem) {
	this.origem = origem;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public String getPassageiro() {
	return passageiro;
}

public void setPassageiro(String passageiro) {
	this.passageiro = passageiro;
}

}
