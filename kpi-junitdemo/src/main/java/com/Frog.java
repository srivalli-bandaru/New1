package com;

public class Frog implements Animal, AquaticAnimal, TerrestrialAnimal {

	@Override
	public void specialCapabilities() {
		System.out.println("Frog is Amphibian animal");
		System.out.println("Frog lives in both land and water");
		
	}

	@Override
	public void LivesIn() {
		// TODO Auto-generated method stub
		AquaticAnimal.super.livesIn();
	}
}