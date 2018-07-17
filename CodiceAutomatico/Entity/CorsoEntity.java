package Entity;

public class CorsoEntity {

	private int codice;
	private String nome;

	public int getCodice() {
		return this.codice;
	}

	/**
	 * 
	 * @param codice
	 */
	public void setCodice(int codice) {
		this.codice = codice;
	}

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

	public CorsoEntity() {
		// TODO - implement CorsoEntity.CorsoEntity
		throw new UnsupportedOperationException();
	}

}