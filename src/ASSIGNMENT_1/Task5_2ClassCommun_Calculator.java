package ASSIGNMENT_1;

public class Task5_2ClassCommun_Calculator {
	int a=100,b=50;
	public void add()
	{
		 
		System.out.println("The Addition is ="+(a+b));
	}
/*	public void sub()
	{	 
	System.out.println("The Subtraction is ="+a-b);//the Operator - is undefined for the argument
                                                   //type(s) String, int
      }
*/	

	public void sub()
	{
	 int c=a-b;
	 System.out.println("The Subtraction is ="+c);
	}
	public void mul()
	{
		 
		System.out.println("The Multiplication is ="+a*b);
	}
	public void div()
	{
		 
		System.out.println("The Division is ="+a/b);
	}
}
