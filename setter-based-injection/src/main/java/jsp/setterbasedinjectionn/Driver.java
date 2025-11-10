package jsp.setterbasedinjectionn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	 public static void main(String[] args) {
		BeanFactory factory =new ClassPathXmlApplicationContext("myConfig.xml");
		Person person=factory.getBean("myPerson", Person.class);
		System.out.println(person);
	 }
}
