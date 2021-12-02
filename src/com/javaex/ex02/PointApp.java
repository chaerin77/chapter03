package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p04 = p02;//주소가 p02와 같을때. p02를 p04에 담아주기
		
		System.out.println("##getClass()");
	    
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("=============================");
		
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("=============================");

	    System.out.println("#toString()");
	    System.out.println(p00.toString());
	    //object가 부모클래스로 있는데 Point에서 toString이 재정의가 일어나서 출력하면 자식인 point의 toString을 출력하는것 
	    //오버라이딩은 아님 오버라이딩은 자식이 가려져있고 부모만보일때임(섞어쓰기) 
	    //ex) Object p01 = new Point()이런거 이경우 출력하면 오버라이딩되어서 자식코드가 부모한테 덮어씌워져서 자식의 toString보임
		System.out.println("=============================");

	    System.out.println("#equals()");
	    System.out.println(p00.equals(p02));
	    System.out.println(p00.equals(p01)); //니가 상상하는 그 의미의값이같냐   //주소는 다르지만 같은거라고 보게끔 돌아가게하고싶어 필드값같으면 같다고해주고싶음
	    //ex03에 관련실험있음
	    System.out.println(p00==p01);//아 이게 주소값 같냐고 물어본거래 다름-> false임
	    System.out.println(p02==p04);//주소가 같니? //물리적으로 결정되어있는거 같냐 물어보는거 같은경우도있음 이렇게 같은주소로 값을 넣어준경우에
	}

}
