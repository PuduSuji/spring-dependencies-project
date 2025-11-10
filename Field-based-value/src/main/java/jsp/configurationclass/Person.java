package jsp.configurationclass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value(value="1")
  int id;
	@Value("Smith")
  String name;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
