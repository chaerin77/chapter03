package com.javaex.ex07;

public class wrapperApp {

	public static void main(String[] args) {

		int no = 10;
		Integer i = new Integer(10);
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		System.out.println(no);
		System.out.println(i);
	    System.out.println(s);
	    System.out.println(b);
	    
	    int num01 = 10;
	    int num02 = 7;
	    int intResult = num01 + num02; //10+7
	    System.out.println(intResult);
	    
	    Integer i01 = new Integer(10);
	    Integer i02 = new Integer(7);
	    Integer result = i01 + i02; //i01 i02 실제로는 주소임 
	    System.out.println(result);
	    
	    
	    Integer i03 = new Integer(99);//99  -->new Integer(99) 자동으로이렇게만들어줌
	
	
	    Integer i04 = new Integer(100); //박스모양으로된애.  우변에 생난리를쳐도 좌변에 Integer이렇게써있는거 기준으로보는것. 따라가면 Integer가있을거야 라는거 따라가면 박스모양일거야
	    int num99 = i04; //순수하게 숫자
	    
	    System.out.println("======================");
	    
	    //문자열 --> int
	    /*
	    Integer i05 = 10;//숫자만넣었는데 자동으로 new일케된거 ->박싱된거임
	    int r01 = i05.parseInt("12345"); //100프로이렇게오는게아닐수있어서 예외처리해줘야 함
	    System.out.println(r01); 저렇게쓰는건잘못쓰고있는
	    */
	    
	    int r01 = Integer.parseInt("12345");//___.parseInt일때 앞에가 변수일땐 소문자로썼는데 이것처럼 대문자로 오면 Static쓰인거
	    System.out.println(r01);
	    
	    System.out.println("=======================");
	    
	    //int --> 문자열 숫자1234를 문자열로
	    /*
	    String a = "안녕하세요"; //메모리에올림 안녕하세요쓸것도아닌데 어색함
	    String sum = a.valueOf(555);
	    System.out.println(sum);
	    */
	    String sum = String.valueOf(555);
	    System.out.println(sum);
	    
	    String r100 = ""+555;
	    System.out.println(r100);
	    
	
	}
	

}
