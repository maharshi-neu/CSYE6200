package edu.neu.csye6200;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println("Driver...\n");

		ExplosionAModel emamObject = new ExplosionAModel();
		emamObject.demo();
		System.out.printf("\n");
		
		ExplosionIModel eimObject = new ExplosionIModel();
		eimObject.demo();

	}

}
