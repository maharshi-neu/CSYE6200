package edu.neu.csye6200;

public class SonicBlast implements ExplodableAPI {
	
	@Override
	public void explode() {
		System.out.println(this.getClass().getSimpleName() + " :: sssssssssss BOOM");
	}
}
