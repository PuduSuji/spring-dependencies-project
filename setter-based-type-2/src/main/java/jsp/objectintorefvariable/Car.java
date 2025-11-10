package jsp.objectintorefvariable;

public class Car {
   private Engine engine;

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}
   public void run() {
	   engine.start();
	   System.out.println(engine);
	   System.out.println("Car is running");
   }
}
