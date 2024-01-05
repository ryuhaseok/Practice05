package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		//출력 결과 예상 = Song(파라미터6개)
		/*
		생성자 오버로딩, this.()로 생성자를 가져와서 syso까지 포함됨.
		따라서 출력결과 : 
			Song(파라미터5개)
			Song(파라미터6개)
		*/
		
	}

}


