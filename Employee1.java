package package1;

public class Employee1 {
	
int id;

double salary;

String name;


public Employee1(int empid,double empsalary, String empname) {

	id = empid; 
	
    salary = empsalary;
   
	name = empname;
	
 }	

  public void display() {
	  
  System.out.println(id);  
  
  System.out.println(salary);
  
  System.out.println(name);
  
  }
  
   public static void main (String[]args) {
	  
   Employee1 e1 = new Employee1(1111,999999.99,"AnilAnnu");
  
   e1 . display();
  
   Employee1 e2 = new Employee1(1112,888888.88,"Prasanth");
  
   e2.display(); 
	
	
}

}
