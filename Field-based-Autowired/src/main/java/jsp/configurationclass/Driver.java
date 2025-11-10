package jsp.configurationclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
   public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	Passenger p=context.getBean("passenger", Passenger.class);
	p.travel();
}
}
