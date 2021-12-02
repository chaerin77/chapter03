package com.javaex.ex01;

public class PointApp {

	public static void main(String[]args) {
	//object 클래스 우리가 만들지 않았지만 존재한다고함
	
	//object 클래스
	Object obj = new Object();
	System.out.println(obj.getClass());
	System.out.println(obj.hashCode());//주소를 대신할 숫자를 갖고있다고 일단 생각
	System.out.println(obj.toString());
	System.out.println(obj.equals(obj));
   
	//getClass() -->클래스정보
    System.out.println("#obj.getClass()");
    System.out.println(obj.getClass()); //어떤클래스인지 이름알려주는것
    System.out.println("===========================");
	
    //hashCode() -->주소값에 대응되는 중복되지 않는 숫자
    System.out.println("#obj.hashCode");
    Object obj01 = new Object();
    Object obj02 = new Object();
    Object obj03 = new Object();

    
    System.out.println(obj01.hashCode());
    System.out.println(obj02.hashCode()); 
    System.out.println(obj03.hashCode()); 

    System.out.println("===========================");
    
    
    //toString() -->객체의 정보를 문자열로 리턴
    System.out.println("#obj.toString");
    System.out.println(obj.toString());
    System.out.println("===========================");

    
    //equals() -->객체가 같은지 비교  ==랑 다름
    System.out.println("#obj.equals()");
    System.out.println(obj01.equals(obj01)); //코드로 같은지 판단하는거
    System.out.println(obj01.equals(obj02));
    System.out.println(obj01==obj01);//실제 변수의 값이 같은건지 물어보는거
   
    
    
	}
	
}