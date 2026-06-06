package Controller;
import java.util.*;

import Model.*;
import View.*;
public class TaxiController {
TaxiView tv;
public TaxiController(TaxiView tv)
{
	this.tv=tv;
}
public void start() throws CloneNotSupportedException 
{
 
   boolean loop = true;
	
	while(loop)
	{

		  int n=TaxiView.choice();
		switch(n)
		{
		case 1:
		{
			char pickupLocation =TaxiView.choice11();
			char dropLocation =TaxiView.choice12();
			int pickupTime = TaxiView.choice13();
			String msg= TaxiBooking.booking(pickupLocation, dropLocation, pickupTime);
			tv.disp(msg);
			break;
		}
		
		case 2:
		{
			ArrayList<Taxi> taxiBookedHistory=TaxiBooking.display();
			tv.dash();
			for(Taxi t : taxiBookedHistory)
			{
				tv.disp(t.toString());
				tv.dash();
			}
			break;
		}
		
		case 3:
		{
			loop = false;
			tv.thank();

			break;
		}
		}
	}
}
}
