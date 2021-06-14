package TestSuite;

import java.io.IOException;
import java.util.*;

import org.testng.annotations.Test;

import BaseDriver.Base;
import Helpers.TestDataReader;

public class HouseSelection extends Base {

	TestDataReader TestData = new TestDataReader();

///////////// Valid values from user input ///////////////////////////
	@Test(enabled = true, priority = 1)
	public void Test01_ValidValues() throws IOException {
		String TestID = new Object() {
		}.getClass().getEnclosingMethod().getName();

		System.out.println(TestID);
// declaring hash set with type arraylist        
		HashSet<ArrayList<String>> set = new HashSet<>();

// reading data from excel sheet
		String StudentData = TestData.getValue(TestID, "StudentData");

//Loading elements into Arraylist
		String totalStudArr[] = StudentData.split(" ");
		int NumOfStudents = totalStudArr.length;

		for (int x = 0; x < NumOfStudents; x++) {
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i <= 2; i++) {
				list.add(totalStudArr[x].split("_")[i]);
			}
			System.out.println(list);

//Loading elements into HashSet
			set.add(list);
		}

//calling Base method of House selection
		Selection(set);

	}
//////////////// duplicate roll number /////////////////////
	@Test(enabled = true, priority = 2)
	public void Test02_DuplicateRullNum() throws IOException {
		String TestID = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(TestID);
// declaring hash set with type arraylist        
		HashSet<ArrayList<String>> set = new HashSet<>();

// reading data from excel sheet
		String StudentData = TestData.getValue(TestID, "StudentData");

//Loading elements into Arraylist
		String totalStudArr[] = StudentData.split(" ");
		int NumOfStudents = totalStudArr.length;

		for (int x = 0; x < NumOfStudents; x++) {
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i <= 2; i++) {
				list.add(totalStudArr[x].split("_")[i]);
			}
			System.out.println(list);

//Loading elements into HashSet
			set.add(list);
		}

//calling Base method of House selection
		Selection(set);
		System.out.println("Duplicates are ignored");
	}

	@Test(enabled = true, priority = 3)
	public void Test03_InvalidValues() throws IOException { // invalid values
		String TestID = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(TestID);
// declaring hash set with type arraylist        
		HashSet<ArrayList<String>> set = new HashSet<>();

// reading data from excel sheet
		String StudentData = TestData.getValue(TestID, "StudentData");

//Loading elements into Arraylist
		String totalStudArr[] = StudentData.split(" ");
		int NumOfStudents = totalStudArr.length;

		for (int x = 0; x < NumOfStudents; x++) {
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i <= 2; i++) {
				list.add(totalStudArr[x].split("_")[i]);
			}
			System.out.println(list);

//Loading elements into HashSet
			set.add(list);
		}

//calling Base method of House selection
		Selection(set);
	}

	@Test(enabled = true, priority = 4)
	public void Test04_ClassValidation() throws IOException { // Class validation other than A and B
		String TestID = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(TestID);
// declaring hash set with type arraylist        
		HashSet<ArrayList<String>> set = new HashSet<>();

// reading data from excel sheet
		String StudentData = TestData.getValue(TestID, "StudentData");

//Loading elements into Arraylist
		String totalStudArr[] = StudentData.split(" ");
		int NumOfStudents = totalStudArr.length;

		for (int x = 0; x < NumOfStudents; x++) {
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i <= 2; i++) {
				list.add(totalStudArr[x].split("_")[i]);
			}
			System.out.println(list);
		
//Loading elements into HashSet
			set.add(list);
		}

//calling Base method of House selection
		Selection(set);
	}

	
////////// Food type validation other than V and NV ///////////
	@Test(enabled = true, priority = 5)
	public void Test05_FoodTypeValidation() throws IOException { 
		String TestID = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(TestID);
// declaring hash set with type arraylist        
		HashSet<ArrayList<String>> set = new HashSet<>();

// reading data from excel sheet
		String StudentData = TestData.getValue(TestID, "StudentData");

//Loading elements into Arraylist
		String totalStudArr[] = StudentData.split(" ");
		int NumOfStudents = totalStudArr.length;

		for (int x = 0; x < NumOfStudents; x++) {
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i <= 2; i++) {
				list.add(totalStudArr[x].split("_")[i]);
			}
			System.out.println(list);

//Loading elements into HashSet
			set.add(list);
		}

//calling Base method of House selection
		Selection(set);
	}

	@Test(enabled = true, priority = 6)
	public void Test06_AlternateInvalidValues() throws IOException { // Alternate invalids validations
		String TestID = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println(TestID);
// declaring hash set with type arraylist        
		HashSet<ArrayList<String>> set = new HashSet<>();

// reading data from excel sheet
		String StudentData = TestData.getValue(TestID, "StudentData");

//Loading elements into Arraylist
		String totalStudArr[] = StudentData.split(" ");
		int NumOfStudents = totalStudArr.length;

		for (int x = 0; x < NumOfStudents; x++) {
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i <= 2; i++) {
				list.add(totalStudArr[x].split("_")[i]);
			}
			System.out.println(list);

//Loading elements into HashSet
			set.add(list);
		}

//calling Base method of House selection
		Selection(set);
	}

}
