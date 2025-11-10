package jsp.constructortype2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("myConfig.xml");
		Person per=factory.getBean("myPerson" , Person.class);
		System.out.println(per);
		per.user();
	}
}
