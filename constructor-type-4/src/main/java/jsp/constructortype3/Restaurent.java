package jsp.constructortype3;

import java.util.Map;

public class Restaurent {
    String loc;
    String name;
    Map<Integer, String> items;
	public Restaurent(String loc, String name, Map<Integer, String> items) {
		super();
		this.loc = loc;
		this.name = name;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Restaurent [loc=" + loc + ", name=" + name + ", items=" + items + "]";
	}
    
}
