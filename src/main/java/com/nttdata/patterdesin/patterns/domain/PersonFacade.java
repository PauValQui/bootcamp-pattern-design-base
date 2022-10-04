package com.nttdata.patterdesin.patterns.domain;

import java.util.List;

public class PersonFacade {
	private List<Person> person;
	
	public PersonFacade() {
		this.person = List.of(new Person());
	}
	
	public List<Person> ListJovenes() {
		List<Person> listaJovenes = new List<Person>();
		
		for(int i = 0; i<this.person.size(); i++) {
			if(this.person.get(i).getAge()>=20 || this.person.get(i).getAge()<=30) {
				listaJovenes.add(this.person.get(i));
			}
		}
		
		return listaJovenes;
	}
}
