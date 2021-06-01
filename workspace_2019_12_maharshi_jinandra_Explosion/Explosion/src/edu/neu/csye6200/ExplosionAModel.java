package edu.neu.csye6200;

/*
 * Class to explode all explosions derived from AbstractExplosionAPI
 */
public class ExplosionAModel {
	
	/*
	 * Method to demonstrate the usage of this class (in this case derived explosions)
	 */
	public static void demo() {

		System.out.println("Demonstrating explosions derived from AbstractExplosionAPI");
		
		/*
		 * Dynamic run-time polymorphism
		 */
		AbstractExplosionAPI aeapi = null;

		
		BombardaMaxima bmObject = new BombardaMaxima();
		aeapi = bmObject;
		aeapi.explode();
		
		AtomicBomb abObject = new AtomicBomb();
		aeapi = abObject;
		aeapi.explode();
		
		Revolver rObject = new Revolver();
		aeapi = rObject;
		aeapi.explode();
		
		
	}

}
