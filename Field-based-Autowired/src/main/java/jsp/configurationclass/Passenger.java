package jsp.configurationclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passenger {
  @Autowired
  Ticket ticket;
  public void travel() {
	  ticket.ticketBooked();
	  System.out.println("passener is travelling");
  }
  
}
