package Entity;

public class CorsoEntity {
	
	private int codice;
	private String nome;
	
	public CorsoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorsoEntity(int codice, String nome) {
		super();
		this.codice = codice;
		this.nome = nome;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "CorsoEntity [codice=" + codice + ", nome=" + nome + "]";
	}
	
	
	

}
