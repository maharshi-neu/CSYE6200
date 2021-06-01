package edu.neu.csye6200;

public class Shotgun implements ExplodableAPI {

	@Override
	public void explode() {
		System.out.println(this.getClass().getSimpleName() + " :: Thud BANG");
	}
}
