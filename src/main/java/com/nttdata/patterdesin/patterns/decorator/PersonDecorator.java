package com.nttdata.patterdesin.patterns.decorator;

public class PersonDecorator implements PersonInterface{
	
	private PersonInterface person;
	
	public PersonDecorator(PersonInterface person) {
		this.person = person;
	}
	@Override
	public String getName() {
		return person.getName();
	}
	@Override
	public void setName(String name) {
		this.person.setName(name);
	}
	@Override
	public int getAge() {
		return person.getAge();
	}
	@Override
	public void setAge(int age) {
		this.person.setAge(age);
	}
}
