package com.words;

public class Word{
	private String word;
	
	public Word(String word){
		this.word = word;
	}
	
	public void setWord(String word){
		this.word = word;
	}
	
	public String getWord(){
		return this.word;
	}
	
	public String toString(){
		return "The bird is the " + this.word;
	}
	
	
	
}