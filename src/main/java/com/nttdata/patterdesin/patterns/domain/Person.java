package com.nttdata.patterdesin.patterns.domain;

import com.nttdata.patterdesin.patterns.decorator.PersonInterface;
import com.nttdata.patterdesin.patterns.prototype.Clonable;

public class Person implements PersonInterface, Clonable {

    private String name;

    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name;
    }
    
    public Object clone() {
    	return new Person(this.name, this.age);
    }
    
    private Person(PersonBuilder personBuilder) {
    	super();
    	this.name = personBuilder.name;
    	this.age = personBuilder.age;
    }
    
    public static class PersonBuilder{
    	private String name;
    	private int age;
    	
    	public PersonBuilder age(int age) {
    		this.age = age;
    		return this;
    	}
    	
    	public PersonBuilder name(String name) {
    		this.name = name;
    		return this;
    	}
    	
    	public Person build() {
    		return new Person(this);
    	}
    }

}
