package jsp.configurationclass;

import org.springframework.stereotype.Component;

@Component
public class Realme implements Mobile{

	@Override
	public void ring() {
         System.out.println("Realme is ringing");		
	}
	
	
}
