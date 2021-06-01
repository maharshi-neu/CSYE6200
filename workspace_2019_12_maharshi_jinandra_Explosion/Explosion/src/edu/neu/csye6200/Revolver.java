package edu.neu.csye6200;

public class Revolver extends AbstractExplosionAPI {

	@Override
	public void explode() {
		System.out.println(this.getClass().getSimpleName() + " :: Wirrrrr Click BANG");
	}

}
