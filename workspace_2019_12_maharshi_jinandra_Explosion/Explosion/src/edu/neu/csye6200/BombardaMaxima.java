package edu.neu.csye6200;

/*
 * Spell used by Professor Umbridge in Harry Potter and the order of the Pheonix
 */
public class BombardaMaxima extends AbstractExplosionAPI {

	@Override
	public void explode() {
		System.out.println(this.getClass().getSimpleName() + " :: KABOOM !!!!");
	}
}
