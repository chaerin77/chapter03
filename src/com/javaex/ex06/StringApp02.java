package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {

		String a = " abcd";
		String b = ",efg";
		
		//a.concat(b); //a에있는거에다가 새로던져준 b를 더해라
		
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
	
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim(); //trim->맨앞이나 맨뒤의 공백을 없애줌. 회원가입 아이디입력할때 공백못넣게하려고씀
		System.out.println("--"+a+"--");
		
		a = a.replace("ab", "황일영");//abcd,efg에서 ab를 황일영으로 바꾸라는뜻
		System.out.println(a);
		
		String[] sArray = a.split(",");//return을 String[]로 해줌 // ,를 기준으로 자르는것 이경우 두덩이로 나뉠것
		//뱉어낸 주소가 왔어 이걸 담아야 나중에접근할수있어서 담아놔야함 ->이름정해주고..따라가보면 뭐있는지..
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		
		String str = "Hello JAVA!";
		
		String r01 = str.substring(3);//방번호3번부터 출력해라
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8); //3번방부터 8번바로앞까지 -7번까지
		System.out.println(r03);
	}

}
