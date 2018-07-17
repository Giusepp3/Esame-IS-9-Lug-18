package Entity;

import java.util.Date;

public class EsameEntity {
	
	private int voto;
	private Date data;
	private boolean lode;
	private CorsoEntity corso;

	public EsameEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EsameEntity(int voto, Date data, boolean lode, CorsoEntity corso) {
		super();
		this.voto = voto;
		this.data = data;
		this.lode = lode;
		this.corso = corso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isLode() {
		return lode;
	}

	public void setLode(boolean lode) {
		this.lode = lode;
	}

	public CorsoEntity getCorso() {
		return corso;
	}

	public void setCorso(CorsoEntity corso) {
		this.corso = corso;
	}

	@Override
	public String toString() {
		return "EsameEntity [voto=" + voto + ", data=" + data + ", lode=" + lode + ", corso=" + corso + "]";
	}
	
	
	

}
