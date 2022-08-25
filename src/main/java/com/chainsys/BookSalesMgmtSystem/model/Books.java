package com.chainsys.BookSalesMgmtSystem.model;

import org.springframework.stereotype.Repository;

@Repository
public class Books {

	private String bookId;
	private String bookName;
	private String author;
	private int edition;
	private String publisher;
	private String category;
	private String language;
	private int price;
	private int mrpRate;
	private int actPrice;
	private int avlQuantity;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMrpRate() {
		return mrpRate;
	}

	public void setMrpRate(int mrpRate) {
		this.mrpRate = mrpRate;
	}

	public int getActPrice() {
		return actPrice;
	}

	public void setActPrice(int actPrice) {
		this.actPrice = actPrice;
	}

	public int getAvlQuantity() {
		return avlQuantity;
	}

	public void setAvlQuantity(int avlQuantity) {
		this.avlQuantity = avlQuantity;
	}

}