package com.javaex.ex10;

public class Book {
    
	//필드
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	//생성자
	public Book(int num, String title, String writer) {
		this.bookNo = num;
		this.title = title;
		this.author = writer;
	}

	
	//메소드 g/s
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//메소드 일반
    public void rent() {
    	this.stateCode = 0;
    	System.out.println(this.getTitle() + "이(가) 대여 됐습니다.");
    }
    public void print() {
    	
    }
    
    
    
}
