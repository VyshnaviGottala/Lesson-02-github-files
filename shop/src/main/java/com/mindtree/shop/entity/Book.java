package com.mindtree.shop.entity;

import javax.persistence.Entity;

@Entity
public class Book extends Products {

	private String bookGenre;
	private String bookAuthor;
	private String bookPublications;

	public Book() {
		super();
	}

	public Book(String bookGenre, String bookAuthor, String bookPublications) {
		super();
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookPublications = bookPublications;
	}

	
	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublications() {
		return bookPublications;
	}

	public void setBookPublications(String bookPublications) {
		this.bookPublications = bookPublications;
	}

	@Override
	public String toString() {
		return "Book [bookGenre=" + bookGenre + ", bookAuthor=" + bookAuthor + ", bookPublications=" + bookPublications
				+ "]";
	}

}
