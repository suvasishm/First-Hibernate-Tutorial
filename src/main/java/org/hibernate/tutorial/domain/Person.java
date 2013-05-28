package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.Set;

public class Person<E> {
	private Long id;
	private int age;
	private String firstname;
	private String lastname;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private Set<E> events = new HashSet<E>();

    public Set<?> getEvents() {
        return events;
    }

    public void setEvents(Set<?> events) {
        this.events = (Set<E>) events;
    }
    
    private Set emailAddresses = new HashSet();

    public Set getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
	// Accessor methods for all properties, private setter for 'id'
}
