package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	//아래 생성자가 있기때문에 디폴트 생성자가 사라짐. 따라서 디폴트 생성자를 추가로 작성해줘야함
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:"+price);
	}
	
}




