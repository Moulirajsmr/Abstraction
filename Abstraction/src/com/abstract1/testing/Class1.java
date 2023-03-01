package com.abstract1.testing;

public abstract class Class1 {
	
	public abstract void ash() ;
	
	public void horse() {
		System.out.println("Arabian");
	}
		
	public abstract void king();
	
	abstract void queen();
	
	public void jack(){
System.out.println("eleven");
	}
public static void main(String[] args) {
	Class1 k = new Class2();
	k.king();
	k.queen();
	k.jack();
	k.horse();
	k.ash();
}

}
