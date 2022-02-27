package amazon.usa.javatest;

public class MyClass2 {
int salary =100;   //INSTENCE witout static key words
static String name ="sumaya"; //GLOBAL with static key word


public void getSalary() {
int income =10000;
String name = "Sazzad";
String info = "2345";
System.out.println(income + name + info);
				
}
 public static void getAlomInfo() {
int age = 20;
String name = "ALOM";
String PhoneNumber = "(646)- 525- 2591";
System.out.println(age + name + PhoneNumber);		
}

 public static void main(String[] args) {
MyClass2 shikha = new MyClass2 ();
shikha.getSalary();

MyClass2.getAlomInfo();

System.out.println("finish");
}

}	


