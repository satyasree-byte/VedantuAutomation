package BaseDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.Assert;

public class Base {

	public void Selection(HashSet<ArrayList<String>> setlist) {

		ArrayList<String> House1 = new ArrayList<>();
		ArrayList<String> House2 = new ArrayList<>();
		ArrayList<String> House3 = new ArrayList<>();
		ArrayList<String> House4 = new ArrayList<>();
		ArrayList<String> NA = new ArrayList<>();

		ArrayList<String> SS = new ArrayList<String>();
		// code for class
		Iterator it = setlist.iterator();

		while (it.hasNext()) {
			SS = (ArrayList<String>) it.next();

			String roll = SS.get(0).trim();
			String Class = SS.get(1);
			String FoodType = SS.get(2);

			if (roll.matches("[0-9]")) {

				if (Class.equals("A") && FoodType.equals("V")) {// house one with AV
					House1.add(roll);
				}

				if (Class.equals("B") && FoodType.equals("V")) {// house one with BV
					House2.add(roll);
				}

				if (Class.equals("A") && FoodType.equals("NV")) {// house one with AV
					House3.add(roll);
				}

				if (Class.equals("B") && FoodType.equals("NV")) {// house one with AV
					House4.add(roll);
				}

				switch (Class) {

				case "A":
					break;
				case "B":
					break;
				default: {
					System.out.println("Invalid Class selection , Class should be A or B");
					NA.add(roll);
					break;
				}

				}

				switch (FoodType) {

				case "V":
					break;
				case "NV":
					break;
				default: {
					System.out.println("Invalid Food Type selection , Food Type should be V or NV");
					NA.add(roll);
					break;
				}

				}

			}
		}
		System.out.println("HOUSE 1 (A V) values :" + House1);
		System.out.println("HOUSE 2 (B V) values :" + House2);
		System.out.println("HOUSE 3 (A NV) values :" + House3);
		System.out.println("HOUSE 4 (B NV) values :" + House4);
		System.out.println("NA values :" + NA);
	}
}
