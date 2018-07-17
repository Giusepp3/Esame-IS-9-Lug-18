package Entity;

public class EsameEntity {

	StudenteEntity esamiSostenuti;
	private int voto;
	private Date data;
	private boolean lode;

	public int getVoto() {
		return this.voto;
	}

	/**
	 * 
	 * @param voto
	 */
	public void setVoto(int voto) {
		this.voto = voto;
	}

	public Date getData() {
		return this.data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}

	public boolean getLode() {
		return this.lode;
	}

	/**
	 * 
	 * @param lode
	 */
	public void setLode(boolean lode) {
		this.lode = lode;
	}

	public int getCodiceCorso() {
		// TODO - implement EsameEntity.getCodiceCorso
		throw new UnsupportedOperationException();
	}

	public EsameEntity() {
		// TODO - implement EsameEntity.EsameEntity
		throw new UnsupportedOperationException();
	}

}