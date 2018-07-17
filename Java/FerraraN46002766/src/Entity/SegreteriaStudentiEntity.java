package Entity;

import java.util.Iterator;
import java.util.LinkedList;

import Stub.EsameStub;
import Stub.SegreteriaStudentiStub;
import Stub.StudenteStub;

public class SegreteriaStudentiEntity {
	
	private LinkedList<StudenteEntity> studentiIscritti;

	public SegreteriaStudentiEntity() {
		super();
		this.studentiIscritti = new LinkedList<StudenteEntity>();
		// TODO Auto-generated constructor stub
		//leggo i dati dal package stub
		SegreteriaStudentiStub s = new SegreteriaStudentiStub();
		Iterator<StudenteStub> it = s.getStudentiIscritti().iterator();
		while(it.hasNext()) {
			StudenteEntity s1 = new StudenteEntity();
			StudenteStub st = it.next();
			s1.setNome(st.getNome());
			s1.setCognome(st.getCognome());
			s1.setMatricola(st.getMatricola());
			Iterator<EsameStub> it2 = st.getEsamiSostenuti().iterator();
			while(it2.hasNext()) {
				EsameEntity e1 = new EsameEntity();
				EsameStub es = it2.next();
				e1.setData(es.getData());
				e1.setVoto(es.getVoto());
				e1.setLode(es.isLode());
				CorsoEntity c1 = new CorsoEntity();
				c1.setCodice(es.getCorso().getCodice());
				c1.setNome(es.getCorso().getNome());
				e1.setCorso(c1);
				s1.add(e1);
				
			}
			this.studentiIscritti.add(s1);
		}
	}

	public SegreteriaStudentiEntity(LinkedList<StudenteEntity> studentiIscritti) {
		super();
		this.studentiIscritti = studentiIscritti;
	}

	public LinkedList<StudenteEntity> getStudentiIscritti() {
		return studentiIscritti;
	}

	public void setStudentiIscritti(LinkedList<StudenteEntity> studentiIscritti) {
		this.studentiIscritti = studentiIscritti;
	}

	@Override
	public String toString() {
		return "SegreteriaStudentiEntity [studentiIscritti=" + studentiIscritti + "]";
	}
	
	
	

}
