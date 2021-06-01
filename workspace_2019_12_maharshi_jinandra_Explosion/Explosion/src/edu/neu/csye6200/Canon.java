package edu.neu.csye6200;

public class Canon implements ExplodableAPI {
	
	@Override
	public void explode() {
		System.out.println(this.getClass().getSimpleName() + " :: BOOOOOOOOOOOOOOOOOOOOOOM");
	}

}
