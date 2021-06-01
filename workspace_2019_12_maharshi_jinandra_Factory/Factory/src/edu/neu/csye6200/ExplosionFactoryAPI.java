package edu.neu.csye6200;

abstract class ExplosionFactoryAPI {

	abstract ExplosionAPI getObject();

	public static void demo() {
		ExplosionAPI x = null;
		
		ExplosionFactoryAPI a = new GrenadeFactory();
		x = a.getObject();
		x.explode();

		ExplosionFactoryAPI b = new GunShotFactory();
		x = b.getObject();
		x.explode();
		
	}
}
