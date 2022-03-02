public class primitivedatatypes {
	public static void main(String args[]){  
		// int data type
		//Declaring String variable  
		String s1="30";  
		//Converting String into int using Integer.parseInt()  
		int i1=Integer.parseInt(s1);  
		//Printing value of i  
		System.out.println(i1);
		
// long data type 
		String s2="9876543210";
		//Converting String into long using Integer.parseLong()  
		long l=Long.parseLong(s2);  
		System.out.println(l);
		
		// float data type
		String s3="23.6";  
		//Converting String into float using Integer.parseFloat()  
		float f=Float.parseFloat("23.6");  
		System.out.println(f);
		
		// double data type
		//Converting String into double using Integer.parseDouble()  
		double d=Double.parseDouble("23.6");  
		System.out.println(d);
		
		// char data type
		String s5="hello";    
		for(int i=0; i<s5.length();i++){  
		        char c = s5.charAt(i);  
		        System.out.println("char at "+i+" index is: "+c);  
		}   
		String s6="true";  
		String s7="TRue";  
		String s8="ok";  
		//Converting String into Boolean using Integer.parseBoolean()
		boolean b1=Boolean.parseBoolean(s6);  
		boolean b2=Boolean.parseBoolean(s7);  
		boolean b3=Boolean.parseBoolean(s8);  
		System.out.println(b1);  
		System.out.println(b2);  
		System.out.println(b3);
		
		// short data type
        String strNumber = "287";
      //Converting String into Short using Integer.parseShort()  
        Short s = Short.parseShort(strNumber);
        
        System.out.println("String to short: " + s);

		// byte data type
        // Initializing String
        String s9 = "Hello World";
  
        // Display the string before conversion
        System.out.println("String: " + s9);
  
        // Converting string to byte array
        // Using getBytes() method
        byte[] res = s9.getBytes();
  
        System.out.println("Byte Array:");
  
        // Display the string after conversion
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }




		


}
}
