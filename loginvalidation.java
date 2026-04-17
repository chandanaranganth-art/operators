package day6;

public class loginvalidation {

	public static void main(String[] args) {
		String id = "admin";
		int password = 12345;
		if(id == "admin")
		{
			System.out.println(" user id is valid");
			if(password == 12345)
			{
				System.out.println("password is valid");
				System.out.println(" login successfull");
			}
			else
			{
				System.out.println("password is invalid");
				System.out.println("login unsuccessfull");
			}
		}
		else
		{
			System.out.println("userid is invalid");
			System.out.println("logoin unsuccessfull");
		}
		
	}

}
