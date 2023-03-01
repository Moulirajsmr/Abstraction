package com.abstract2.testing;

public class Class2 extends Class3 {

	@Override
	public void cpu() {
		System.out.println("Th CPU");
	}

	@Override
	public void display() {
		System.out.println("The DISPLAY");
	}
	
	public static void main(String[] args) {
		Class2 k = new Class2();
		k.cpu();
		k.display();
		k.keyboard();
		k.mouse();
	}

}
