package jsp.objectintorefvariable;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
  public static void main(String[] args) {
	BeanFactory factory=new ClassPathXmlApplicationContext("myConfig.xml");
	Car car=factory.getBean("myCar",Car.class);
	System.out.println(car);
	car.run();
}
}
