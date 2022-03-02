package methods;

public class UserDefined {
	public int add(int m, int n) {
		int l = m+n;
		return l;
		
	}

	public static void main(String[] args) {
		
		System.out.println("The method written by the user or programmer is known as a User-Defined Method");
		System.out.println("Example of UserDefined");
		UserDefined Result=new UserDefined();
		System.out.println("Addition of two numbers is:"+Result.add(12,13));
		

	}

}
