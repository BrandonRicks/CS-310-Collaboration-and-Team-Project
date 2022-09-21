package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import snhu.jukebox.playlist.Student;
import snhu.jukebox.playlist.StudentList;
import snhu.student.playlists.*;


public class StudentTest {

	//Test the list of student names and ensure we get back the name value we expect at the correct/specific point in the list
	@Test
	public void testGetStudentNameList1() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent1Name", studentNames.get(0));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	@Test
	public void testGetStudentNameList2() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent2Name", studentNames.get(1));							//test case to see if the second value contains the name we expect
	}
	
	//Module 5 - Add your unit test case here to check for your name after you have added it to the StudentList
	@Test
	public void testGetStudentNameDaoudSogoba( ) {
		List<String> studentNames = new ArrayList<String>();
		StudentList studentList = new StudentList();
		studentNames = studentList.getStudentsNames();
		assertEquals("Daoud Sogoba", studentNames.get(2));
	}

	@Test
	public void testGetStudentNameList3() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("NickSchnack", studentNames.get(2));								//test case to see if the second value contains the name we expect
	}

	// Comment out this broken code to run JUnit tests
	//	assertEquals("TestStudent3Name", studentNames.get(2));							//test case to see if the second value contains the name we expect
	//}
	
	//Module 5 - Add your unit test case here to check for your name after you have added it to the StudentList
	@Test
	public void testGetStudentNameList_NickSchnack() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("NickSchnack", studentNames.get(3));								//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	// Add unit test case for Brandon Ricks
	@Test
	public void testGetStudentNameList_BrandonRicks() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("BrandonRicks", studentNames.get(2));								//test case to see if the third value contains the name we expect
	}

	// Test case to check for my name (Brian Houts).
	@Test
	public void testGetBrianHouts() {
		List<String> studentNames = new ArrayList<String>();
		StudentList studentList = new StudentList();
		studentNames = studentList.getStudentsNames();
		// Looping through ArrayList for my name.
		for(int i=0; i<studentNames.size(); i++) {
			if(studentNames.get(i).equals("BrianHouts")) {
					assertEquals("BrianHouts", studentNames.get(i));
			}
		}
	}
	
	// Test to make sure Dalton Young is the third entry in studentList
	@Test
	public void testGetStudentNameList3_DaltonYoung() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Dalton Young", studentNames.get(4));								//test case to see if the third value contains Dalton Young
	}
	
	@Test
	public void testGetStudentNameList_MatthewClockel() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Matthew Clockel", studentNames.get(5));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}	

	@Test
	public void testGetStudentNameList_ChloeNinefeldt() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent3Name", studentNames.get(2));
	}

	// Add test case for student SabrinaButeyn name check
	@Test
	public void testGetStudentNameList12_SabrinaButeyn() {								//test case to see if the tenth value contains the name expected
		List<String> studentNames = new ArrayList<String>();
		StudentList studentList = new StudentList();
		studentNames = studentList.getStudentsNames();
		assertEquals("SabrinaButeyn", studentNames.get(11));
	}

	@Test
	public void testGetTreyProfile() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Trey", studentNames.get(2));								//test case to see if the third value is me!
	}

	//Module 6 Test Case Area
	//Test each student profile to ensure it can be retrieved and accessed
	@Test
	public void testGetStudent1Profile() {
		TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();						//instantiating the variable for a specific student
		Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());		//creating populated student object
		assertEquals("TestStudent1", TestStudent1.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	@Test
	public void testGetStudent2Profile() {
		TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
		Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
		assertEquals("TestStudent2", TestStudent2.getName());
	
	}
	
	@Test 
	public void testStudent3Profile() {
		DaoudSogoba_Playlist daoudSogoba_Playlist = new DaoudSogoba_Playlist();
		Student DaoudSogoba = new Student("DaoudSogoba", daoudSogoba_Playlist.StudentPlaylist());
		assertEquals("DaoudSogoba", DaoudSogoba.getName());
	}
	
	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList
	//add ChloeNinefeldt Profile
	@Test
	public void testGetChloeNinefeldtProfile() {
		ChloeNinefeldt_Playlist testChloeNinefeldtPlaylist = new ChloeNinefeldt_Playlist();
		Student ChloeNinefeldt = new Student("ChloeNinefeldt", testChloeNinefeldtPlaylist.StudentPlaylist());
		assertEquals("ChloeNinefeldt", ChloeNinefeldt.getName());
	}
	
	@Test
	public void testGetNathonChavezProfile() {
		NathonChavezPlaylist testStudent3Playlist = new NathonChavezPlaylist();
		Student TestStudent3 = new Student("NathonChavez", testStudent3Playlist.StudentPlaylist());
		assertEquals("NathonChavez", TestStudent3.getName());
	}
	
	// Test for Brandon Ricks profile to ensure it can be retrieved and accessed
	@Test
	public void testGetBrandonRicksProfile() {
		BrandonRicks_Playlist brandonRicksPlaylist = new BrandonRicks_Playlist();						//instantiating the variable for a specific student
		Student BrandonRicks = new Student("BrandonRicks", brandonRicksPlaylist.StudentPlaylist());		//creating populated student object
		assertEquals("BrandonRicks", BrandonRicks.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	// Test the student profile for Dalton Young 
	@Test
	public void testGetDaltonYoungProfile() {
		DaltonYoung_Playlist daltonYoungPlaylist = new DaltonYoung_Playlist();						// Instantiate the variable for Dalton Young
		Student DaltonYoung = new Student("Dalton Young", daltonYoungPlaylist.StudentPlaylist());	// Create the populated student object
		assertEquals("Dalton Young", DaltonYoung.getName());										// Test that the name matches what is expected
	}

	// Test student profile of SabrinaButeyn
	@Test
	public void testGetSabrinaButeynProfile() {
		SabrinaButeyn_Playlist testSabrinaButeynPlaylist = new SabrinaButeyn_Playlist();						
		Student SabrinaButeyn = new Student("SabrinaButeyn", testSabrinaButeynPlaylist.StudentPlaylist());		
		assertEquals("SabrinaButeyn", SabrinaButeyn.getName());	
	}

	@Test
	public void testGetBrianHoutsProfile() {
		BrianHouts_Playlist brianhoutsPlaylist = new BrianHouts_Playlist();						// Instantiate the variable for Dalton Young
		Student BrianHouts = new Student("Brian Houts", brianhoutsPlaylist.StudentPlaylist());	// Create the populated student object
		assertEquals("Brian Houts", BrianHouts.getName());										// Test that the name matches what is expected
	}
}