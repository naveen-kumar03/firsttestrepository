package packageday1;

public class ParentClass {

	int salary;
	int bonus;

	public ParentClass() {
		salary = 50;
		bonus = 50;
	}

	public ParentClass(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}

	void CalculateSalary() {
		int totalsalary;

		totalsalary = salary + bonus;

		System.out.println("My own salary :" + totalsalary);
	}

	int CalculateSalary(int salary, int bonus) {

		int totalsalary;

		totalsalary = this.salary + bonus;

		return totalsalary;
	}

	int CalculateSalary1(int salary, int bonus) {
		int totalsalary;

		totalsalary = salary + this.bonus;

		return totalsalary;

	}

}
