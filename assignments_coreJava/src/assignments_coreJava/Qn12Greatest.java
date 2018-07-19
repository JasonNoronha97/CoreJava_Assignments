package assignments_coreJava;

//12. Write a Java program to define three integer variables "a","b" and "c", assign the values 10, 20 and 30 respectively.  Find out the biggest number and print it.

public class Qn12Greatest {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;

		if (a > b && a > c)
			System.out.println("A greatest");
		else if (b > a && b > c)
			System.out.println("B is greatest");
		else
			System.out.println("C is greatest");
		

	}

}
