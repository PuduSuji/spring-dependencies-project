package jsp.constructortype3;

import java.util.List;

public class Teacher {
   String name;
   int age;
   List<String> subjects;
public Teacher(String name, int age, List<String> subjects) {
	super();
	this.name = name;
	this.age = age;
	this.subjects = subjects;
}
@Override
public String toString() {
	return "Teacher [name=" + name + ", age=" + age + ", subjects=" + subjects + "]";
}
   
}
