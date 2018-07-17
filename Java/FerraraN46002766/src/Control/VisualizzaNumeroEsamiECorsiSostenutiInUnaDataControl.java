package Control;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import Entity.CorsoEntity;
import Entity.EsameEntity;
import Entity.SegreteriaStudentiEntity;
import Entity.StudenteEntity;

public class VisualizzaNumeroEsamiECorsiSostenutiInUnaDataControl {

	public VisualizzaNumeroEsamiECorsiSostenutiInUnaDataControl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LinkedList<String> VisualizzaNumeroEsamiECorsi(Date data){
		int numeroEsami=0;
		int numeroCorsi=0;
		LinkedList<Integer> codiciCorso = new LinkedList<Integer>();
		System.out.println("dati inizializzati");
		SegreteriaStudentiEntity s = new SegreteriaStudentiEntity();
		LinkedList<StudenteEntity> studenti = s.getStudentiIscritti();
		System.out.println("ho letto " + studenti.size() + " studenti");
		System.out.println("carico gli esami di ogni studente");
		Iterator<StudenteEntity> itStudente = studenti.iterator();
		while(itStudente.hasNext()){ //per ogni studente
			LinkedList<EsameEntity> esamiSostenuti = itStudente.next().getEsamiSostenuti();
			Iterator<EsameEntity> itEsame = esamiSostenuti.iterator();
			while(itEsame.hasNext()) { //per ogni esame
				EsameEntity e = itEsame.next();
				if(e.getData().equals(data)) { //controllo che l'esame sia stato sostenuto nella data desiderata
					numeroEsami++;
					CorsoEntity c = e.getCorso();
					int cod = c.getCodice();
					if(!codiciCorso.contains(cod)) { //controllo che il corso non sia stato gia conteggiato e in tal caso lo conteggio
						numeroCorsi++;
						codiciCorso.add(cod);
					}
					
				}
			}
			
			System.out.println("ho contato " + numeroEsami + " esami e  " + numeroCorsi + " corsi" );
		}
		
		//creo i risultati o l'errore
		
		if(numeroEsami == 0) { // se non sono stati sostenuti esami in quella data
			LinkedList<String> r = new LinkedList<String>();
			r.add("Non sono stati sostenuti esami in data " + data.toString());
			return r;
		}
		
		String esami = Integer.toString(numeroEsami);
		String corsi = Integer.toString(numeroCorsi);
		
		LinkedList<String> r = new LinkedList<String>();
		
		r.add(0,esami);
		r.add(1,corsi);
		
		return r;
		
	}
	
}
