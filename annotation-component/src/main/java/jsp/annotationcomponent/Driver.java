package jsp.annotationcomponent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("myConfig.xml");
		Student st=factory.getBean("student" , Student.class);
		Employee em=factory.getBean("employee" , Employee.class);
		System.out.println(st);
		System.out.println(em);
	}
}
