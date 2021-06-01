package edu.neu.csye6200;

public class AtomicBomb extends AbstractExplosionAPI {

	@Override
	public void explode() {
		System.out.println(this.getClass().getSimpleName() + " :: Ooooo BOOOOOOOM krkrkrkrkrkrk");
	}

}
