package jsp.configurationclass;

import org.springframework.stereotype.Component;

@Component
public class Ticket {
	public void ticketBooked() {
		System.out.println("Ticket is confirmed");
	}
	
}
