package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Final create TWO classes in a single Eclipse project, EACH class (100 POINTS
 * EACH) with a static demo() method called by Driver class.
 * 
 * 100 TOTAL POINTS First class which must be created is:
 * 
 * class TwoAlternatingThreads
 * 
 * Design a class that will start two PERFECTLY alternating threads
 * demonstrating control as they alternate output. Two threads take turns
 * alternating outputting the letters of the alphabet (LOWERCASE and UPPERCASE)
 * to console (aAbAcCdD...zZ).
 * 
 * 25 POINTS: Output ENTIRE alphabet using TWO Threads on a SINGLE LINE 25
 * POINTS: Start Threads 50 POINTS: Control Threads
 * 
 * 30 POINT DEDUCTED FOR INVALID SUBMISSION: Correct Submission to Canvas,
 * specifically: 1. On-time, 2. Executable, 3. Eclipse workspace correctly named
 * and zipped (e.g. named like 'workspace_2020-6_dan_peters_final' and zipped as
 * 'workspace_2020-6_dan_peters_final.zip'), 4. Console output cut and paste at
 * end of main() method as comment.
 * 
 * 
 * 100 TOTAL POINTS Second class which must be created is:
 * 
 * class Final
 * 
 * Create one Final class meeting the following requirements (10 POINTS EACH
 * REQUIREMENT):
 * 
 * 1. Create one Final class with static demo() method (USE and COMPLETE demo()
 * STUB below) private data int scale=3 and int offset=20, using ONLY Inner
 * classes in Final class when creating other classes 2. create AbstractItemAPI
 * with private data and public getter and setters methods for int ID, double
 * price, String name 3. create Item class derived from AbstractItemAPI and
 * overriding toString() 4. create constructor to parse CSV string data and
 * create Item object initialized with data, e.g. Item(String csvStringData). 5.
 * create graphInt to show on console MAGNITUDE of int value, example for int
 * values 1,2,3 show on console exactly as follows (one line per value, with
 * value in [] first): [1] * [2] ** [3] *** 6. create graphDouble like graphInt
 * but for double values AND ROUND UP, e.g. 3.5 => 4.0 example for double values
 * 1.1,2.2,3.5 show on console exactly as follows (one line per value, with
 * value in [] first): [1.1] * [2.2] ** [3.5] **** 7.create graphItem to show on
 * console MAGNITUDE of Item prices AND ROUND UP Item toString() state on each
 * line LAST example for price (double) values 1.1,2.2,3.5 show on console
 * exactly as follows (one line per value, followed with String representation
 * of Item object state [] LAST) * [#1 $1.1 Bread] ** [#2 $2.2 Milk] **** [#3
 * $3.5 OJ] 8. Create void graphUpDownIntegers() method in Final class to Use
 * graphInt to show on console 3 SETS of int values (values, values*scale,
 * values*scale+offset) EACH set integers values sorted ascending and descending
 * example for int values 1,2,3 show on console exactly as follows (one line per
 * value, with value in [] first AND REPEAT for EACH of 3 sets): [1] * [2] **
 * [3] *** [3] *** [2] ** [1] * 9. Create void graphUpDownDoubles() method in
 * Final class to Use graphDouble to show on console 3 SETS of double values
 * (values, values*scale, values*scale+offset) EACH set sorted ascending and
 * descending example for double values 1.1,2.2,3.5 show on console exactly as
 * follows (one line per value, with value in [] first) AND REPEAT for EACH of 3
 * sets): [1.1] * [2.2] ** [3.5] **** [3.5] **** [2.2] ** [1.1] * 10. Create
 * void graphUpDownItems() method in Final class to Use graphItem to show on
 * console 3 SETS of price values (values, values*scale, values*scale+offset)
 * EACH set Amazon Item price double values sorted ascending and descending
 * example for price (double) values 1.1,2.2,3.5 show on console exactly as
 * follows (one line per value, followed with String representation of Item
 * object state [] LAST) AND REPEAT for EACH of 3 sets): * [#1 $1.1 Bread] **
 * [#2 $2.2 Milk] **** [#3 $3.5 OJ] **** [#3 $3.5 OJ] ** [#2 $2.2 Milk] * [#1
 * $1.1 Bread]
 * 
 * @author dgpeters
 *
 */
public class Final {
	public static final int MAJOR_REV = 1;
	public static final int MINOR_REV = 0;
	private static String revision = null;
	private int scale;
	private int offset;

	private Consumer<Integer> graphInt = (n) -> {
		System.out.print("[" + n + "] ");
		while (n-- > 0)
			System.out.print("*");
		System.out.println();
	} /* end graphInt */;

	private Consumer<Double> graphDouble = (d) -> {
		System.out.print("[" + d + "] ");
		while (d-- > 0.49)
			System.out.print("*");
		System.out.println();
	} /* end graphDouble */;

	private Consumer<Item> graphItem = (d) -> {
		double price = d.getPrice();
		while (price-- > 0.49)
			System.out.print("*");
		System.out.print("\t\t[" + d.toString() + "] ");
		System.out.println();
	} /* end graphDouble */;

	/**
	 * Static initializer block
	 */
	static {
		Final.revision = MAJOR_REV + "." + MINOR_REV;
	}

	/**
	 * object instance initializer block
	 */
	{
		this.offset = 20;
		this.scale = 5;
	}

	/**
	 * AbstractItem inner class
	 */
	private abstract class AbstractItemAPI {
		private int id;
		private double price;
		private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	} // end class AbstractItemAPI

	/**
	 * Item inner class A comsumer Item, Derived from AbstractItemAPI, bought and
	 * sold.
	 */
	private class Item extends AbstractItemAPI {

		public Item() {
			super();
		}

		public Item(int id, double price, String name) {
			super();
			this.setId(id);
			this.setPrice(price);
			this.setName(name);
		}

		public Item(String csvDataString) {
			super();

			String[] tokens = csvDataString.split(",");
			int id = 0;
			double price = 0.0;

			try {
				id = Integer.parseInt(tokens[0]);
			} catch (NumberFormatException e) {
				System.err.println("ERROR: Invalid Item ID String encoded int '" + tokens[0] + "'");
				e.printStackTrace();
			}

			try {
				price = Double.parseDouble(tokens[1]);
			} catch (NumberFormatException e) {
				System.err.println("ERROR: Invalid Item Price String encoded double '" + tokens[1] + "'");
				e.printStackTrace();
			}
			this.setId(id);
			this.setPrice(price);
			this.setName(tokens[2]);
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();

			sb.append("#").append(this.getId());
			sb.append(" $ ").append(this.getPrice());
			sb.append(" ").append(this.getName());

			return sb.toString();
		}

	} // end class Item

	@Override
	public String toString() {
		return "version = " + Final.revision;
	}

	public Final() {
		super();
	}

	public Final(int scale, int offset) {
		super();
		this.scale = scale;
		this.offset = offset;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * graphUpDownIntegers (first Scale and Offset) all numbers in list.
	 * 
	 * @param nList  list of numbers
	 * @param scale  scale factor to multiply
	 * @param offset offset value to add
	 */
	public void graphUpDownIntegers(List<Integer> nList, int scale, int offset) {
		System.out.println();
		/**
		 * COMPLETE THIS STUB METHOD
		 */

	}

	/**
	 * graphUpDownItems (first Scale and Offset) all numbers in list.
	 * 
	 * @param nList  list of numbers
	 * @param scale  scale factor to multiply
	 * @param offset offset value to add
	 */
	public void graphUpDownDoubles(List<Double> dList, int scale, int offset) {
		System.out.println();
		/**
		 * COMPLETE THIS STUB METHOD
		 */
	}

	/**
	 * graphUpDownItems (first Scale and Offset) all numbers in list.
	 * 
	 * @param nList  list of numbers
	 * @param scale  scale factor to multiply
	 * @param offset offset value to add
	 */
	public void graphUpDownItems(List<Item> itemList, int scale, int offset) {
		System.out.println();
		/**
		 * COMPLETE THIS STUB METHOD
		 */
	}

	/**
	 * demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println("\n\t" + Final.class.getName() + ".demo()...");

		Final obj = new Final();
		/**
		 * Graph 3 sets of Simple Integer Numbers, SORTED ASCENDING & DESCENDING set #1
		 * uses supplied numbers unchanged set #2 uses supplied numbers, each value
		 * multiplied by scale set #3 uses supplied numbers, each value multiplied by
		 * scale AND with offset added
		 */
		System.out.println("Graph Integers");
		Integer[] nList = { 2, 1, 3 }; // supplied numbers
		/**
		 * COMPLETE THIS SECTION IN THIS STUB METHOD
		 */
//		obj.graphUpDownIntegers(  ...  );
//		obj.graphUpDownIntegers(  ...  );
//		obj.graphUpDownIntegers(  ...  );

		/**
		 * Graph 3 sets of Simple Double Numbers, SORTED ASCENDING & DESCENDING set #1
		 * uses supplied numbers unchanged set #2 uses supplied numbers, each value
		 * multiplied by scale set #3 uses supplied numbers, each value multiplied by
		 * scale AND with offset added
		 */
		System.out.println("Graph Doubles");
		Double[] dList = { 2.2, 1.1, 3.5 }; // supplied numbers
		/**
		 * COMPLETE THIS SECTION IN THIS STUB METHOD
		 */
//		obj.graphUpDownDoubles(  ...  );
//		obj.graphUpDownDoubles(  ...  );
//		obj.graphUpDownDoubles(  ...  );

		System.out.println("Graph Prices of Amazon Items");
		/**
		 * Create a List of Amazon Item object from the following CSV data IN THIS ORDER
		 * (DO NOT DO FILE IO, simply parse each String to create each ITEM object)
		 * "2,1.49,Milk" "1,3.49,OJ" "3,.99,Nestles Chocolate"
		 */
		List<Item> itemList = new ArrayList<Item>(Arrays.asList(obj.new Item("2,1.49,Milk"), obj.new Item("1,3.49,OJ"),
				obj.new Item("3,.99,Nestles Chocolate")));

		/**
		 * Graph 3 sets of Amazon Item prices, SORTED ASCENDING & DESCENDING set #1 uses
		 * supplied Item object prices unchanged set #2 uses supplied Item object
		 * prices, each value multiplied by scale set #3 uses supplied Item object
		 * prices, each value multiplied by scale AND with offset added
		 */
		/**
		 * COMPLETE THIS SECTION IN THIS STUB METHOD
		 */
//		obj.graphUpDownItems(  ...  );
//		obj.graphUpDownItems(  ...  );
//		obj.graphUpDownItems(  ...  );

		System.out.println("\n\t" + Final.class.getName() + ".demo()... done!");
	}

}