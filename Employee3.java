package package1;

public class Employee3 {
	
	private int id;
	
	private double salary;
	
	private String name;
	
	public Employee3(int doublesalary,String name) {
		
    this.id = id;
    
    this.salary = salary;
    		
    this.name = name;		
	}
	
  @Override
   public String toString() {
	return id + " "+salary+" "+name;
	
  }
  
  public static void main(String[]args) {
	  
	  Employee3 e1 = new Employee3(99999,"ANNU");
	  
	  System.out.println(e1.toString());

}

}