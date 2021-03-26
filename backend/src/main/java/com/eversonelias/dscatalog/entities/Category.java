package com.eversonelias.dscatalog.entities;

import java.io.Serializable;

public class Category implements Serializable{

	/*
	 * Serializable is a Java pattern so the Java object can be converted into bytes.
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public Category() {
	}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * hashCode (below) is a default method that every Java object can have.
	 * It compares if an object equals another.
	 * It is a fast comparison that will generate a number.
	 * There is a small possibility that two generated number will be the same. But it can happens.
	 * hashCode will be faster than equals. But, if we find identical numbers, we must confirm with equals.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * The equals method (below) is safer than hashCode.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
}
