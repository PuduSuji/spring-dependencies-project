package jsp.constructortype3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("myConfig.xml");
		Teacher teach=factory.getBean("myTeacher" , Teacher.class);
		System.out.println(teach);
		
	}
}
