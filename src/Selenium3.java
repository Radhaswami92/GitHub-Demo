import org.testng.annotations.Test;

public class Selenium3 {
	
	double mainsalary;
	String mainname;

	@Test
	public void PersonBWritting() {

		System.out.println("I am a person B created a new class in the exixting project ");

	}
	
	
	@Test
	public void methodoverloading(String s) {
		
		s="GitDemo Guy";
		System.out.println(s);
		this.mainname=s;
		
		
	}
	
	@Test
	private void methodoverloading(int empid){
		
		empid=1453;
	
		System.out.println(empid);
	
		
	}
	
	@Test
	protected void methodoverloading(double salary){
		
		salary=14500.56;
		this.mainsalary=salary;
		System.out.println(salary);
		
		
	}
	
	@Test
	public void MergeConflictScenario() {
		
		System.out.println("Merge Conflict with the New branch Developer 2");
		
		
	}

}
