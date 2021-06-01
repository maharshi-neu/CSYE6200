package edu.neu.csye6200;

public class SimpleExplosionFactory {
	enum ExplosionCriteria {
		GUNSHOT,
		GRENADE
	}

	public ExplosionAPI getObject(ExplosionCriteria c) {
		ExplosionAPI  x = null;
		switch (c) {
			case GUNSHOT:
				x = new GunShot();
				break;
			case GRENADE:
				x = new Grenade();
				break;
		}
		return x;
	}
	
	public static void demo() {
		SimpleExplosionFactory factory = new SimpleExplosionFactory();
		ExplosionAPI x = factory.getObject(ExplosionCriteria.GUNSHOT);
		x.explode();
		ExplosionAPI y = factory.getObject(ExplosionCriteria.GRENADE);
		y.explode();
	}

}
