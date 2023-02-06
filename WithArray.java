package com.abstractionAndEncapsulation;
import java.util.ArrayList;

public class WithArray {
	public static void main(String [] args) {
		ArrayList<studentArrayList> studentList = new ArrayList<studentArrayList>(); 
				studentList.add(new studentArrayList("Sujit", 1));
				studentList.add(new studentArrayList("Tamanna", 2));
				studentList.add(new studentArrayList("Kali", 3));
				studentList.add(new studentArrayList("Hari", 4));
				studentList.add(new studentArrayList("Pili", 5));
				
		printStudentList(studentList);
		
		studentList.remove(3);
		printStudentList(studentList);
	}
	
	
	public static void printStudentList(ArrayList<studentArrayList> students) {
		for(studentArrayList student : students) {
			//studentArrayList student = (studentArrayList) o;
			System.out.println(student.getDetails());
		}
	}

}

class studentArrayList{
	private final String name;
	private final int RollNumber;
	
	public studentArrayList(String name, int RollNumber) {
		this.name = name;
		this.RollNumber = RollNumber;
	}
	public String getDetails() {
		return "Name: "+ this.name + '\n'+ "Roll Number: "+ this.RollNumber;
	}
}