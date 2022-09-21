package snhu.jukebox.playlist;

import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);		

		// Added my name to the list of student profiles.
		String BrianHouts = "BrianHouts";
		studentNames.add(BrianHouts);

		String DaoudSogoba = "Daoud Sogoba";
		studentNames.add(DaoudSogoba);

		String StudentName3 = "TestStudent3Name";
		studentNames.add(StudentName3);

		String NickSchnack = "NickSchnack"; 
		studentNames.add(NickSchnack);

		String ChloeNinefeldt = "ChloeNinefeldt";
		studentNames.add(ChloeNinefeldt);

		String Trey = "Trey";
		studentNames.add(Trey);
		
		//Module 5 Code Assignment
		//Add your name to create a new student profile
		//Use template below and put your name in the areas of 'StudentName'
		//String StudentName3 = "TestStudent3Name";
		//studentNames.add(StudentName3);
		
		String DaltonYoung = "Dalton Young";
		studentNames.add(DaltonYoung);

		String MatthewClockel = "Matthew Clockel";
		studentNames.add(MatthewClockel);

		String NathonChavez = "Nathon Chavez";
		studentNames.add(NathonChavez);

		// Add student SabrinaButeyn (student 12 in list (updated from 5, then 10))
		String SabrinaButeyn = "SabrinaButeyn";
		studentNames.add(SabrinaButeyn);
		
		String BrandonRicks = "BrandonRicks";
		studentNames.add(BrandonRicks);
		
		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
			   
		   case "DaoudSogoba_Playlist":
			   DaoudSogoba_Playlist daoudSogobaPlaylist = new DaoudSogoba_Playlist();
			   Student DaoudSogoba =  new Student("DaoudSogoba", daoudSogobaPlaylist.StudentPlaylist());
			   return DaoudSogoba;

		   //create playlist test for Trey King
		   case "Treys_Playlist":
			   Treys_Playlist treysPlaylist = new Treys_Playlist();
			   Student Trey = new Student("Trey", treysPlaylist.StudentPlaylist());
			   return Trey;
			   			   
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.
		   case "NathonChavez":
			   NathonChavezPlaylist testStudent3Playlist = new NathonChavezPlaylist();
			   Student TestStudent3 = new Student("TestStudent3", testStudent3Playlist.StudentPlaylist());
			   return TestStudent3;			

		   // Create student profile for Dalton Young
		   case "DaltonYoung_Playlist":
			   DaltonYoung_Playlist daltonYoungPlaylist = new DaltonYoung_Playlist();						// Instantiate the playlist for Dalton Young 
			   Student DaltonYoung = new Student("Dalton Young", daltonYoungPlaylist.StudentPlaylist());	// Create a student object passing his name and playlist
			   return DaltonYoung;
		   
		   case "ChloeNinefeldt_Playlist":
			  ChloeNinefeldt_Playlist ChloeNinefeldtPlaylist = new ChloeNinefeldt_Playlist();
			  Student ChloeNinefeldt = new Student("ChloeNinefeldt", ChloeNinefeldtPlaylist.StudentPlaylist());
			  return ChloeNinefeldt;

		   case "BrandonRicks_Playlist":
			   BrandonRicks_Playlist brandonRicksPlaylist = new BrandonRicks_Playlist();
			   Student BrandonRicks = new Student("BrandonRicks", brandonRicksPlaylist.StudentPlaylist());
			   return BrandonRicks;
		
		   // Add student profile for SabrinaButeyn
		   case "SabrinaButeyn_Playlist":
			   SabrinaButeyn_Playlist testSabrinaButeynPlaylist = new SabrinaButeyn_Playlist();
			   Student SabrinaButeyn = new Student("SabrinaButeyn", testSabrinaButeynPlaylist.StudentPlaylist());
			   return SabrinaButeyn;
			  
		   case "BrianHouts_Playlist":
				  BrianHouts_Playlist brianhoutsPlaylist = new BrianHouts_Playlist();
				  Student BrianHouts = new Student("Brian Houts", brianhoutsPlaylist.StudentPlaylist());
				  return BrianHouts;
		}
		return emptyStudent;
	}
}