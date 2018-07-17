package Entity;

import java.util.Iterator;
import java.util.LinkedList;

import Stub.EsameStub;
import Stub.SegreteriaStudentiStub;
import Stub.StudenteStub;

public class StudenteEntity {
	
	private String nome;
	private String cognome;
	private String matricola;
	private LinkedList<EsameEntity> esamiSostenuti;
	
	public StudenteEntity() {
		super();
		// TODO Auto-generated constructor stub	
		this.esamiSostenuti = new LinkedList<EsameEntity>();
		
	}

	public StudenteEntity(String nome, String cognome, String matricola, LinkedList<EsameEntity> esamiSostenuti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.esamiSostenuti = esamiSostenuti;
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

	public LinkedList<EsameEntity> getEsamiSostenuti() {
		return esamiSostenuti;
	}

	public void setEsamiSostenuti(LinkedList<EsameEntity> esamiSostenuti) {
		this.esamiSostenuti = esamiSostenuti;
	}

	@Override
	public String toString() {
		return "StudenteEntity [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola
				+ ", esamiSostenuti=" + esamiSostenuti + "]";
	}

	public boolean add(EsameEntity e) {
		return esamiSostenuti.add(e);
	}
	
	

}
