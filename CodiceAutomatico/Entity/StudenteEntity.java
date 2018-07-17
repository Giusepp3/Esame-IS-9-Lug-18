package Entity;

public class StudenteEntity {

	private String nome;
	private String cognome;
	private String marticola;

	public String getNome() {
		return this.nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	/**
	 * 
	 * @param cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMarticola() {
		return this.marticola;
	}

	/**
	 * 
	 * @param marticola
	 */
	public void setMarticola(String marticola) {
		this.marticola = marticola;
	}

	public StudenteEntity() {
		// TODO - implement StudenteEntity.StudenteEntity
		throw new UnsupportedOperationException();
	}

	public LinkedList<EsameEntity> getNumeroEsami() {
		// TODO - implement StudenteEntity.getNumeroEsami
		throw new UnsupportedOperationException();
	}

}