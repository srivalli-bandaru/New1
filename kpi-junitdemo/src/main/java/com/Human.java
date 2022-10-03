package com;

public abstract class Human {
	abstract String Work();
	abstract int play();
	abstract String Dance();
	public int Art() {
		return 5;
		
	}
}
class Son extends Human {

	@Override
	String Work() {
		// TODO Auto-generated method stub
		return "Work";
	}

	@Override
	int play() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String Dance() {
		// TODO Auto-generated method stub
		return "Dance";
	}
	
}