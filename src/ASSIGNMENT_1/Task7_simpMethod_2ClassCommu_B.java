package ASSIGNMENT_1;

public class Task7_simpMethod_2ClassCommu_B {
	
	public void m2()
	{
		System.out.println("M2----B");
	}
	public static void main(String[] args) {
		
		Task7_simpMethod_2ClassCommu_A a=new Task7_simpMethod_2ClassCommu_A();
		
		Task7_simpMethod_2ClassCommu_B b=new Task7_simpMethod_2ClassCommu_B();
		a.m1();
		b.m2();
		
	}

}
