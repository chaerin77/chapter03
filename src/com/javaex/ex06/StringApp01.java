package com.javaex.ex06;

import java.util.Scanner;

public class StringApp01 {

	public static void main(String[] args) {
        /*
		String st = "안녕하세요";
		String str = new String("안녕하세요");
		Scanner sc = new Scanner(System.in);
		Point p01 = new Point(3,2);*/
		
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); //false나옴 주소값이같냐고 물어보는것->주소 다름
	
	    System.out.println(str01.hashCode());
	    System.out.println(str02.hashCode());
	
	    System.out.println("===========================");
	    
	    String str03 = "hello"; //글자가 같으면 코드값이 같다
	    String str04 = "hello";
	    
	    System.out.println(str03 == str04);
	    System.out.println(str03.hashCode());
	    System.out.println(str04.hashCode());
	    
	    str04="hello!!!";
	    System.out.println(str03 == str04);
	    System.out.println(str03.hashCode());
	    System.out.println(str04.hashCode());
	    
	    System.out.println(str04.toString()); //toString 재정의된것 str04-> 주소. 0x994
	    
	}

}
