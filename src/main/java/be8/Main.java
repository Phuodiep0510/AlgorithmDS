package be8;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    ArrayList<Student> studentList = new ArrayList<>();
	    ArrayList<Mentor> mentorList = new ArrayList<>();

	while (true) {
	            System.out.println("\n===== MENU =====");
	            System.out.println("1. Register new Student");
	            System.out.println("2. Register new Mentor");
	            System.out.println("3. View All Students and Mentors");
	            System.out.print("Enter your choice (1/2/3): ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume leftover newline

	            if (choice == 1) {
	                // Register Student
	                System.out.print("Enter Student Name: ");
	                String name = scanner.nextLine();

	                System.out.print("Enter Student Gmail: ");
	                String gmail = scanner.nextLine();

	                System.out.print("Enter Student Phone: ");
	                String phone = scanner.nextLine();

	                Student newStudent = new Student(name, gmail, phone);
	                studentList.add(newStudent);
	                System.out.println("Student registered successfully!");

	            } else if (choice == 2) {
	                // Register Mentor
	                System.out.print("Enter Mentor Name: ");
	                String name = scanner.nextLine();

	                System.out.print("Enter Mentor Years of Experience: ");
	                int years = scanner.nextInt();
	                scanner.nextLine(); // consume leftover newline

	                Mentor newMentor = new Mentor(name, years);
	                mentorList.add(newMentor);
	                System.out.println("Mentor registered successfully!");

	            } else if (choice == 3) {
	                // View all Students and Mentors
	                System.out.println("\n--- List of Students ---");
	                if (studentList.isEmpty()) {
	                    System.out.println("No students registered yet.");
	                } else {
	                    for (Student student : studentList) {
	                        System.out.println(student);
	                    }
	                }

	                System.out.println("\n--- List of Mentors ---");
	                if (mentorList.isEmpty()) {
	                    System.out.println("No mentors registered yet.");
	                } else {
	                    for (Mentor mentor : mentorList) {
	                        System.out.println(mentor);
	                    }
	                }

	            } else {
	                System.out.println("Invalid choice! Please choose 1, 2, or 3.");
	            }
	        }
	    }
	}

	// Student class (no public)
	class Student {
	    private String name;
	    private String gmail;
	    private String phone;

	    public Student(String name, String gmail, String phone) {
	        this.name = name;
	        this.gmail = gmail;
	        this.phone = phone;
	    }

	    @Override
	    public String toString() {
	        return "Student Name: " + name + ", Gmail: " + gmail + ", Phone: " + phone;
	    }
	}

	// Mentor class (no public)
	class Mentor {
	    private String name;
	    private int yearOfExperience;

	    public Mentor(String name, int yearOfExperience) {
	        this.name = name;
	        this.yearOfExperience = yearOfExperience;
	    }

	    @Override
	    public String toString() {
	        return "Mentor Name: " + name + ", Years of Experience: " + yearOfExperience;
	    }
	}


