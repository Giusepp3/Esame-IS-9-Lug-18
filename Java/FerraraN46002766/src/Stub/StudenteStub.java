package Stub;

import java.util.LinkedList;

public class StudenteStub {
	
	private String nome;
	private String cognome;
	private String matricola;
	private LinkedList<EsameStub> esamiSostenuti;
	
	public StudenteStub() {
		super();
		// TODO Auto-generated constructor stub
		this.esamiSostenuti = new LinkedList<EsameStub>();
	}

	public StudenteStub(String nome, String cognome, String matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.esamiSostenuti = new LinkedList<EsameStub>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public LinkedList<EsameStub> getEsamiSostenuti() {
		return esamiSostenuti;
	}

	public void setEsamiSostenuti(LinkedList<EsameStub> esamiSostenuti) {
		this.esamiSostenuti = esamiSostenuti;
	}

	public boolean add(EsameStub e) {
		return esamiSostenuti.add(e);
	}
	
	

}
