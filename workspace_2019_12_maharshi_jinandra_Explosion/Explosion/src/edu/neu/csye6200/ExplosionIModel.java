package edu.neu.csye6200;

/*
 * Class to explode all explosions derived from ExplodableAPI
 */
public class ExplosionIModel {

	/*
	 * Method to demonstrate the usage of this class (in this case derived explosions)
	 */
	public void demo() {

		System.out.println("Demonstrating explosions derived from ExplodableAPI");
		
		/*
		 * Dynamic run-time polymorphism
		 */
		ExplodableAPI eapi = null;
		
		Shotgun sObject = new Shotgun();
		eapi = sObject;
		eapi.explode();
		
		SonicBlast sbObject = new SonicBlast();
		eapi = sbObject;
		eapi.explode();
		
		Canon cObject = new Canon();
		eapi = cObject;
		eapi.explode();

	}

}
