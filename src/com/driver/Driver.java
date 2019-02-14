package com.driver;

import com.shapes.Circle;
import com.shapes.Square;
import com.words.Word;

public class Driver{
	public static void main(String[] args){
		Circle c1 = new Circle(1.25);
		Square sq1 = new Square(1.35);
		Word w1 = new Word("Word");
		System.out.println(c1);
		System.out.println(sq1);
		System.out.println(w1);
	}
	
}