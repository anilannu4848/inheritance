package package1;

public class Message {
	
public static void display() {
	
System.out.println("Hello....");	

}	

public static void display(String firstName) {
	
	System.out.println("Hello...."+firstName);
	
}

public static void dislay(String firstName,String lastName) {
	
	System.out.println("Hello...."+firstName+" "+lastName);
	
}
	public static void main(String[] args) {
		
	 Message.display();
	 
	 Message.display("ANILANNU");
	 
	 Message.dislay("ANILANNU","M");
			
	}

}
