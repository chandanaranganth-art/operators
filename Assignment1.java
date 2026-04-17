package day5;

public class Assignment1 {

	public static void main(String[] args) {
		int marks = 85;  

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }
        else if (marks >= 81) {
            System.out.println("Distinction");
        }
        else if (marks >= 60) {
            System.out.println("First Class");
        }
        else if (marks >= 35) {
            System.out.println("Second Class");
        }
        else {
            System.out.println("Fail");
        }
	}
}