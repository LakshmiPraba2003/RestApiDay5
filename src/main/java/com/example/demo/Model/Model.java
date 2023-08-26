package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


import jakarta.persistence.Table;


@Entity
@Table(name="BOOKTABLE")
public class Model {
	@Id
	private int id;
	private String bookName;
	private float price;
	private int quantity;
	private String authorName;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Order order;
	
	
	public Model() {
		super();
	}
public Model(int id, String bookName, float price, int quantity, String authorName) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.price = price;
	this.quantity = quantity;
	this.authorName = authorName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
	
	
     
}