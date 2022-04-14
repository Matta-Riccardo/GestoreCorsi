package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDao;
import it.polito.tdp.corsi.db.StudenteDao;

public class Model {
	
	private CorsoDao corsoDao;
	private StudenteDao stedenteDao;
	
	public Model() {
		this.corsoDao = new CorsoDao();
		this.stedenteDao = new StudenteDao();
	}
	
	public List<Corso> getCorsoByPeriodo (int periodo){
		return this.corsoDao.getCorsiByPeriodo(periodo);
	}
	
	public Map<Corso, Integer> getIscritti (int periodo){
		return this.corsoDao.getIscritti(periodo);
	}
	
	public List<Studente> getStudentiByCorso (String codins){
		return this.stedenteDao.getStudentiByCorso(codins);
	}
	
	public List<Divisione> getDivisioneStudenti (String codins){
		return this.stedenteDao.getDivisioneStudenti(codins);
	}
}
