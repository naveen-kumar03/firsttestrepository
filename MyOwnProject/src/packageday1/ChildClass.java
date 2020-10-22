package packageday1;

public class ChildClass {

	public static void main(String[] args) {

		
		ParentClass var = new ParentClass(2,3);
		var.CalculateSalary();
		
		
		ParentClass var1 = new ParentClass();
		var1.salary=200;
		var1.bonus=100;
		int result = var1.CalculateSalary(2,5);
		System.out.println("Salary:"+result );
		
		ParentClass var2 = new ParentClass();
		var2.salary=200;
		var2.bonus=100;
		int result1 = var2.CalculateSalary1(4,6);
		System.out.println("Result:"+result1);
		
		ParentClass var3 = new ParentClass();
		var3.CalculateSalary();
	
	}

}
