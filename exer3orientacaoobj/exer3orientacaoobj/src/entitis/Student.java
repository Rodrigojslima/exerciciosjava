package entitis;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	
	}
	
	public String result() {
		if(finalGrade() < 60) {
			return "FAILED";
		}else {
			return "PASS";
		}		
	}
	
	public double missing() {
		if(finalGrade() < 60) {
			return 60.00 - finalGrade();
		} else {
			return 0.0;
		} 
			
		}
			

}

