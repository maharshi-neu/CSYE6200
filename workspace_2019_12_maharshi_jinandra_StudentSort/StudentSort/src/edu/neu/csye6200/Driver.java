package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main...!");
		NEUclass neu = new NEUclass();
		
		/**
		 * Main...!
		Student START----------------------------------
		-----------Default Sort (gpa)-----------------------
		Student [id=111, firstName=Harry, lastName=Trio, age=107, gpa=1.99]
		Student [id=11111, firstName=Dick, lastName=Trio, age=78, gpa=2.99]
		Student [id=1111, firstName=Tom, lastName=Trio, age=99, gpa=3.98]
		Student [id=1, firstName=Ramesh, lastName=Fivestar, age=17, gpa=3.99]
		Student [id=11, firstName=Suresh, lastName=Fivestar, age=15, gpa=4.0]

		-------------Sort by age--------------------------
		Student [id=11, firstName=Suresh, lastName=Fivestar, age=15, gpa=4.0]
		Student [id=1, firstName=Ramesh, lastName=Fivestar, age=17, gpa=3.99]
		Student [id=11111, firstName=Dick, lastName=Trio, age=78, gpa=2.99]
		Student [id=1111, firstName=Tom, lastName=Trio, age=99, gpa=3.98]
		Student [id=111, firstName=Harry, lastName=Trio, age=107, gpa=1.99]

		---------------Sort by Id------------------------
		Student [id=1, firstName=Ramesh, lastName=Fivestar, age=17, gpa=3.99]
		Student [id=11, firstName=Suresh, lastName=Fivestar, age=15, gpa=4.0]
		Student [id=111, firstName=Harry, lastName=Trio, age=107, gpa=1.99]
		Student [id=1111, firstName=Tom, lastName=Trio, age=99, gpa=3.98]
		Student [id=11111, firstName=Dick, lastName=Trio, age=78, gpa=2.99]

		--------------Sort First Name-------------------------
		Student [id=11111, firstName=Dick, lastName=Trio, age=78, gpa=2.99]
		Student [id=111, firstName=Harry, lastName=Trio, age=107, gpa=1.99]
		Student [id=1, firstName=Ramesh, lastName=Fivestar, age=17, gpa=3.99]
		Student [id=11, firstName=Suresh, lastName=Fivestar, age=15, gpa=4.0]
		Student [id=1111, firstName=Tom, lastName=Trio, age=99, gpa=3.98]

		-------------Sort Last Name--------------------------
		Student [id=1, firstName=Ramesh, lastName=Fivestar, age=17, gpa=3.99]
		Student [id=11, firstName=Suresh, lastName=Fivestar, age=15, gpa=4.0]
		Student [id=11111, firstName=Dick, lastName=Trio, age=78, gpa=2.99]
		Student [id=111, firstName=Harry, lastName=Trio, age=107, gpa=1.99]
		Student [id=1111, firstName=Tom, lastName=Trio, age=99, gpa=3.98]

		----------------------------------Student END
		Teacher START----------------------------------
		-----------Default Sort (wage)-----------------------
		Teacher [id=3, firstName=Bo, lastName=Ring, age=79, wage=0.11]
		Teacher [id=4, firstName=Slo, lastName=W, age=7, wage=0.99]
		Teacher [id=19, firstName=Max, lastName=Kwait, age=71, wage=99.0]
		Teacher [id=5, firstName=Fred, lastName=Vegas, age=17, wage=999.0]
		Teacher [id=9, firstName=Xi, lastName=Pao, age=777, wage=9999.0]

		-------------Sort by age--------------------------
		Teacher [id=4, firstName=Slo, lastName=W, age=7, wage=0.99]
		Teacher [id=5, firstName=Fred, lastName=Vegas, age=17, wage=999.0]
		Teacher [id=19, firstName=Max, lastName=Kwait, age=71, wage=99.0]
		Teacher [id=3, firstName=Bo, lastName=Ring, age=79, wage=0.11]
		Teacher [id=9, firstName=Xi, lastName=Pao, age=777, wage=9999.0]

		---------------Sort by Id------------------------
		Teacher [id=3, firstName=Bo, lastName=Ring, age=79, wage=0.11]
		Teacher [id=4, firstName=Slo, lastName=W, age=7, wage=0.99]
		Teacher [id=5, firstName=Fred, lastName=Vegas, age=17, wage=999.0]
		Teacher [id=9, firstName=Xi, lastName=Pao, age=777, wage=9999.0]
		Teacher [id=19, firstName=Max, lastName=Kwait, age=71, wage=99.0]

		--------------Sort First Name-------------------------
		Teacher [id=3, firstName=Bo, lastName=Ring, age=79, wage=0.11]
		Teacher [id=5, firstName=Fred, lastName=Vegas, age=17, wage=999.0]
		Teacher [id=19, firstName=Max, lastName=Kwait, age=71, wage=99.0]
		Teacher [id=4, firstName=Slo, lastName=W, age=7, wage=0.99]
		Teacher [id=9, firstName=Xi, lastName=Pao, age=777, wage=9999.0]

		-------------Sort Last Name--------------------------
		Teacher [id=19, firstName=Max, lastName=Kwait, age=71, wage=99.0]
		Teacher [id=9, firstName=Xi, lastName=Pao, age=777, wage=9999.0]
		Teacher [id=3, firstName=Bo, lastName=Ring, age=79, wage=0.11]
		Teacher [id=5, firstName=Fred, lastName=Vegas, age=17, wage=999.0]
		Teacher [id=4, firstName=Slo, lastName=W, age=7, wage=0.99]

		----------------------------------Teacher END
		 */
		neu.Demo();
	}
}
