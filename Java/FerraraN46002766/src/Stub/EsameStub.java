package Stub;

import java.util.Date;

public class EsameStub {
	
	private int voto;
	private Date data;
	private boolean lode;
	private CorsoStub corso;
	
	public EsameStub() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EsameStub(int voto, Date data, boolean lode, CorsoStub corso) {
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

	public CorsoStub getCorso() {
		return corso;
	}

	public void setCorso(CorsoStub corso) {
		this.corso = corso;
	}
	
	
	

}
