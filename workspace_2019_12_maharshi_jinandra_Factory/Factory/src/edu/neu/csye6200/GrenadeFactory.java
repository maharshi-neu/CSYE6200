package edu.neu.csye6200;

public class GrenadeFactory extends ExplosionFactoryAPI {

	@Override
	Grenade getObject() {
		return new Grenade();
	}

}
