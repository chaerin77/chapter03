package com.javaex.ex03;

public class Point {

	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	
	//메소드 g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	@Override //ctrl alt s implements override 클릭 - equals
	public boolean equals(Object obj) {//부모. 밑에 Point가 올지 꿈에도 몰랐음 이 밑에 뭐가올지모르니까 모든애의 조상인 object로 놓으면 다 비교가능
        Point p = (Point)obj; 
		
		//a.x == b.x && a.y == b.y
		//x는 x끼리 같고 y는 y끼리 같고. 두값이 동시에 같은 값을 만족해야함
		//this.x==x  && this.y==y
		
		if(this.x==p.x && this.y==p.y) {
			return true;
		}else {
			return false;
		}
		
		/*
		if(this.x==((Point)obj).x && this.y==((Point)obj).y) {
			return true;
		}else {
			return false;
		}  */
		
		
	}
	
	
}
