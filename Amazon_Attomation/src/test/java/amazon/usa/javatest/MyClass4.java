package amazon.usa.javatest;

public class MyClass4 {
	// inside the class but outside the method  with 
	//static key word is called Class or Global variable	
static String sazzad;
// inside the class but outside the method  without 
//static key word is called Instance variable 
String name;
//Declairation 
int number;
//Initialization
int age = 16;

public void getinfo() {
//inside the method is called local variable	
float salary = 80000.50124f;	
System.out.println("this is my salary "+salary);
}

public static void getSalary() {
System.out.println("this is my get salary method");	
}
public String getAge() {
String name1 = "shikha";	
return name1;	
	
}

			
	public static void main(String[] args) {
		// how to call static method
		//ans: by class name
MyClass4.getSalary();
//how to call non-static method
//Ans: by object 
//how to create a object
MyClass4 obj =new MyClass4();
obj.getinfo();
	}

}
