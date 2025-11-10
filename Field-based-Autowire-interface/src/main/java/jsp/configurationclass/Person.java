package jsp.configurationclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  @Autowired
  Mobile mobile;
 public void use() {
	 System.out.println("Person is using mobile");
	 mobile.ring();
 }
  
}
