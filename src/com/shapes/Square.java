package com.shapes;

public class Square{
	private double side;
	
	public Square(double side){
		this.side = side;
	}
	
	public double getSide(){
		return this.side;
	}
	
	public void setSide(double Side){
		this.side = side;
	}
	
	public String toString(){
		return "Square[Side="+this.side+"]";
	}
	
}