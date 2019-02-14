package com.yyy;

public class Circle{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public String toString(){
		return "Circle[Radius="+this.radius+"]";
	}
	
}