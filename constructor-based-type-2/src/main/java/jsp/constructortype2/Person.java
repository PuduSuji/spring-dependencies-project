package jsp.constructortype2;

public class Person {
   Mobile mobile;
   public void user() {
	   System.out.println("Person is using mobile");
	   mobile.ring();
   }
public Person(Mobile mobile) {
	super();
	this.mobile = mobile;
}
   
}
