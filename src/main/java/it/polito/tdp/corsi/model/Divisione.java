package it.polito.tdp.corsi.model;

public class Divisione implements Comparable<Divisione>{

	private String CDS;
	private Integer numeroStudenti;
	
	public Divisione(String cDS, Integer numeroStudenti) {
		super();
		CDS = cDS;
		this.numeroStudenti = numeroStudenti;
	}
	public String getCDS() {
		return CDS;
	}
	public Integer getNumeroStudenti() {
		return numeroStudenti;
	}
	public void setCDS(String cDS) {
		CDS = cDS;
	}
	public void setNumeroStudenti(Integer numeroStudenti) {
		this.numeroStudenti = numeroStudenti;
	}
	@Override
	public int compareTo(Divisione o) {
		return o.getCDS().compareTo(this.CDS);
	}
	
	//non uso metode hascode e equals perchè so che non usero tali oggetti
	//in un hashset o in un hashmap e non andrò mai a fare un .equals()
	//è questa semplicemente una clsasse di appoggio che uso per ordinare e stampare
	
	
	
	
}
