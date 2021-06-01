package edu.neu.csye6200;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("Main...");
		System.out.println("Simple Factory Pattern");
		SimpleExplosionFactory.demo();
		System.out.println("Factory Pattern (GoF)");
		ExplosionFactoryAPI.demo();
		/**
		 * 
			Main...
			Simple Factory Pattern
			Dhishoom!!!
			Booom !!
			Factory Pattern (GoF)
			Booom !!
			Dhishoom!!!
		 *
		 */
	}

}