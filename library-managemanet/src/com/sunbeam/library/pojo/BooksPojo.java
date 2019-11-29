package com.sunbeam.library.pojo;

public class BooksPojo {

	private  int id ;
	private   String name ;
	private String  auther ;
	private String subject ;
	private int price ;
	private int isbn ;
	public BooksPojo(int id, String name, String auther, String subject, int price, int isbn) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.subject = subject;
		this.price = price;
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auther == null) ? 0 : auther.hashCode());
		result = prime * result + id;
		result = prime * result + isbn;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksPojo other = (BooksPojo) obj;
		if (auther == null) {
			if (other.auther != null)
				return false;
		} else if (!auther.equals(other.auther))
			return false;
		if (id != other.id)
			return false;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BooksPojo [id=" + id + ", name=" + name + ", auther=" + auther + ", subject=" + subject + ", price="
				+ price + ", isbn=" + isbn + "]";
	}
	
	
	
}
