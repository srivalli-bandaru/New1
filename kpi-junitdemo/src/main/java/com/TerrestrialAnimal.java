package com;

public interface TerrestrialAnimal {

	default public void  LivesIn() {
		System.out.println("Lives on land");
	}
}
