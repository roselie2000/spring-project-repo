package com.chainsys.sample.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKDETAILS")
public class Books {

	@Id
	@Column(name = "BOOKID")
	private String bookId;

	@Column(name = "BOOKNAME")
	private String bookName;

	@Column(name = "AUTHOR")
	private String author;

	@Column(name = "PUBLISHER")
	private String publisher;

	@Column(name = "EDITION")
	private int edition;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "MRP_RATE")
	private int mrpRate;

	@Column(name = "ACT_RATE")
	private int actPrice;

	@Column(name = "AVL_QUANTITY")
	private int avlQuantity;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "BOOKIMAGE")
	@Lob
	private Blob bkImg;

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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Blob getBkImg() {
		return bkImg;
	}

	public void setBkImg(Blob bkImg) {
		this.bkImg = bkImg;
	}

}
