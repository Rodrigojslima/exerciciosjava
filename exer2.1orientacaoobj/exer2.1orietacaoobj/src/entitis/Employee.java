package entitis;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentege) {
		return grossSalary += grossSalary * percentege / 100.00;
	}
	public String toString() {
		return name + ", " + String.format("%.2f", netSalary());
		}

}

	
