package day6;

public class matrimonyassingment {

	public static void main(String[] args) {
		String gender = "Male";  
        int age = 21;            

        if (gender.equals("Male")) {
            if (age >= 21) {
                System.out.println("You can marry");
            } else {
                System.out.println("Please wait, you are not yet 21");
            }
        } 
        else if (gender.equals("Female")) {
            if (age >= 18) {
                System.out.println("You can marry");
            } else {
                System.out.println("Please wait, you are not yet 18");
            }
        } 
        else {
            System.out.println("Invalid gender");
        }

	}

}
