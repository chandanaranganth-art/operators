package day7;

public class assignment5pattern {

	public static void main(String[] args) {
		int rows = 3;

        for (int i = 1; i <= rows; i++) {
            
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

           
            System.out.println();
        }

	}

}
