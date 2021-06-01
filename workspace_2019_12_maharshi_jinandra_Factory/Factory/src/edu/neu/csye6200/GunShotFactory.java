package edu.neu.csye6200;

public class GunShotFactory extends ExplosionFactoryAPI {

	@Override
	GunShot getObject() {
		return new GunShot();
	}

}
