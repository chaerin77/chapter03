package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		
		Point a = new Point(2,3); //a,b가 같은애라고 인식되었으면 좋겠음
		Point b = new Point(2,3);
		Point c = new Point(100,139);
	
		Point d = c; //d를 만들고 c의 주소를 d에게 넣었음
		
		
		System.out.println(a==b); //주소값 비교하는것 다른주소임 둘다 힙에 따로따로 자리 잡았을것. new ___는 어떻게 비교해도 다 주소가 다름
	    System.out.println(d==c);//주소비교. 값이 같음
	    
	    System.out.println("===========================");
	    System.out.println(a.equals(b));//b랑 같냐고 물어보는거 다르다고 나올텐데 둘이 생성자 안 값이 같으면 같다고 나왔으면 좋겠음
	    //부모인 equals(object)로는 원하는 결과가 안나왔기때문에 이 메소드 재정의 하기 위해서 자식인 Point에다가 메소드 만들기로함 그거 만들려면 Point틀에다 만들어야함.
	 
	    System.out.println(b.equals(c));
	
	
	}

}
