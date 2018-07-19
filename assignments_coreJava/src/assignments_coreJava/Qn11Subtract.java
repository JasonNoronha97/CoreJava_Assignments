package assignments_coreJava;

//11. Write a Java program to define two integer variables "a" and "b", assign the values 10 and 20 respectively.  Subtract the smaller number from the bigger number and display the result.

public class Qn11Subtract {

	public static void main(String[] args) {
		int a=10, b=20;
		
		if(a>b)
			System.out.println(a-b);
		else
			System.out.println(b-a);

	}

}
