public class nichols_matthew_TestMethodOverloading {
	/**Main Method*/
	public static void main(String[] args) {
	System.out.println("The minimum of 3 and 4 is "+ min(3, 4));
	
	System.out.println("The minimum of 3.0 and 5.4 is " + min(3.0, 5.4));
	
	System.out.println("The minimum of 3.0, 5.4, and 10.14 is " + min(3.0, 5.4, 10.14));
	}
	//two int values
	public static int min(int num1, int num2) {
		if(num1 > num2)
			return num2;
		else
			return num1;
	}
	//two double values
	public static double min(double num1, double num2) {
		if (num1>num2)
			return num2;
		else
			return num1;
	}
	//return the max of three double values
	public static double min(double num1, double num2, double num3) {
		return min(min(num1,num2), num3);
	}
}