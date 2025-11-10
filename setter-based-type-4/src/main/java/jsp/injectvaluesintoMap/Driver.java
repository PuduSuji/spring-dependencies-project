package jsp.injectvaluesintoMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
	public static void main(String[] args) {
		BeanFactory fac= new ClassPathXmlApplicationContext("myConfigxml.xml");
		Shop shop=fac.getBean("myShop", Shop.class);
		System.out.println(shop);
	}
}
